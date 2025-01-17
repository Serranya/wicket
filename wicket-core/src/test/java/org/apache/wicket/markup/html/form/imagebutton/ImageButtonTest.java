/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wicket.markup.html.form.imagebutton;

import java.util.Locale;

import org.apache.wicket.util.tester.WicketTestCase;
import org.junit.jupiter.api.Test;

/**
 * @author Juergen Donnerstag
 */
class ImageButtonTest extends WicketTestCase
{
	/**
	 * 
	 * @throws Exception
	 */
	@Test
    void imageButton() throws Exception
	{
		Locale.setDefault(new Locale("en", "US"));

		tester.startPage(Home.class);

		tester.clickLink("goCanadian");
		tester.assertContains("resource/org.apache.wicket.markup.html.form.imagebutton.Home/Beer.gif\\?5~en_CAnullnull\"");

		tester.clickLink("goChinese");
		tester.assertContains("resource/org.apache.wicket.markup.html.form.imagebutton.Home/Beer.gif\\?5~zh_CNnullnull\"");

		tester.clickLink("goDanish");
		tester.assertContains("resource/org.apache.wicket.markup.html.form.imagebutton.Home/Beer.gif\\?5~da_DKnullnull\"");

		tester.clickLink("goDutch");
		tester.assertContains("resource/org.apache.wicket.markup.html.form.imagebutton.Home/Beer.gif\\?5~nl_NLnullnull\"");

		tester.clickLink("goGerman");
		tester.assertContains("resource/org.apache.wicket.markup.html.form.imagebutton.Home/Beer.gif\\?5~de_DEnullnull\"");

		tester.clickLink("goUS");
		tester.assertContains("resource/org.apache.wicket.markup.html.form.imagebutton.Home/Beer.gif\"");
	}
}
