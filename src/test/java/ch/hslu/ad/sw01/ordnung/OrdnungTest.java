/*
 * Copyright 2018 Roland Gisler, HSLU Informatik, Switzerland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.ad.sw01.ordnung;

import ch.hslu.ad.sw01.task.Task;
import org.apache.logging.log4j.LogManager;
import org.junit.Test;


@SuppressWarnings("PMD.TooManyMethods")
public class OrdnungTest {

    @Test
    public void testWachsumsfunktion() {
        Ordnung.wachstumsfunktionen(100);
    }




}
