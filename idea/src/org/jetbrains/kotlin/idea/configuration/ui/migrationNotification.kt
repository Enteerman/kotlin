/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.configuration.ui

import com.intellij.notification.*
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.impl.SimpleDataContext
import com.intellij.openapi.project.Project
import org.jetbrains.kotlin.idea.configuration.KotlinConfigurationBundle
import org.jetbrains.kotlin.idea.configuration.MigrationInfo
import org.jetbrains.kotlin.idea.migration.CodeMigrationAction

internal fun showMigrationNotification(project: Project, migrationInfo: MigrationInfo) {
    val detectedChangeMessage = buildString {
        appendBr(KotlinConfigurationBundle.message("migration.text.detected.migration"))
        if (migrationInfo.oldStdlibVersion != migrationInfo.newStdlibVersion) {
            appendIndentBr(
                KotlinConfigurationBundle.message(
                    "migration.text.standard.library",
                    migrationInfo.oldStdlibVersion,
                    migrationInfo.newStdlibVersion
                )
            )
        }

        if (migrationInfo.oldLanguageVersion != migrationInfo.newLanguageVersion) {
            appendIndentBr(
                KotlinConfigurationBundle.message(
                    "migration.text.language.version",
                    migrationInfo.oldLanguageVersion,
                    migrationInfo.newLanguageVersion
                )
            )
        }

        if (migrationInfo.oldApiVersion != migrationInfo.newApiVersion) {
            appendIndentBr(
                KotlinConfigurationBundle.message(
                    "migration.text.api.version",
                    migrationInfo.oldApiVersion,
                    migrationInfo.newApiVersion
                )
            )
        }
    }

    KOTLIN_MIGRATION_NOTIFICATION_GROUP
        .createNotification(
            KotlinConfigurationBundle.message("migration.title.kotlin.migration"),
            "${KotlinConfigurationBundle.message("migration.text.migrations.for.kotlin.code.are.available")}<br/><br/>$detectedChangeMessage",
            NotificationType.WARNING,
            null
        )
        .also { notification ->
            notification.addAction(NotificationAction.createSimple(KotlinConfigurationBundle.message("migration.text.run.migrations")) {
                val projectContext = SimpleDataContext.getProjectContext(project)
                val action = ActionManager.getInstance().getAction(CodeMigrationAction.ACTION_ID)
                Notification.fire(notification, action, projectContext)

                notification.expire()
            })
        }
        .notify(project)
}

private fun StringBuilder.appendBr(line: String) = this.append("$line<br/>")
private fun StringBuilder.appendIndentBr(line: String) = appendBr("&nbsp;&nbsp;$line")

private const val KOTLIN_MIGRATION_NOTIFICATION_ID = "Kotlin Migration"
private val KOTLIN_MIGRATION_NOTIFICATION_GROUP =
    NotificationGroup(KOTLIN_MIGRATION_NOTIFICATION_ID, NotificationDisplayType.STICKY_BALLOON, true)
