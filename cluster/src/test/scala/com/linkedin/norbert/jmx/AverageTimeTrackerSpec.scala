/*
 * Copyright 2009-2010 LinkedIn, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.linkedin.norbert.jmx

import org.specs.SpecificationWithJUnit

class AverageTimeTrackerSpec extends SpecificationWithJUnit {
  "AverageTimeTracker" should {
    "correctly average the times provided" in {
      val a = new AverageTimeTracker(100)
      (1 to 100).foreach(a.addTime(_))
      a.average must be_==(50)
      a.addTime(101)
      a.average must be_==(51)
    }
  }
}
