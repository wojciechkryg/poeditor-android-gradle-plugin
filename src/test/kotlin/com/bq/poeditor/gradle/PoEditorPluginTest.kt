/*
 * Copyright 2020 BQ
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bq.poeditor.gradle

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert
import org.junit.Test

/**
 * PoEditorPluginTest test.
 */
class PoEditorPluginTest {
    @Test
    fun poeditorPluginAddsImportPoEditorStringsTaskToProject() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply(PoEditorPlugin::class.java)

        Assert.assertTrue(project.tasks.findByName("importPoEditorStrings") is ImportPoEditorStringsTask)
    }

}