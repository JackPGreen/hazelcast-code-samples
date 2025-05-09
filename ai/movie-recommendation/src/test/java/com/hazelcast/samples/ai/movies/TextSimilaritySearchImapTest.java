/*
 * Copyright (c) 2008-2024, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hazelcast.samples.ai.movies;

import org.junit.jupiter.api.Test;

class TextSimilaritySearchImapTest {

    @Test
    void testMainOffloaded() throws Exception {
        TextSimilaritySearchImap.offloaded = true;
        TextSimilaritySearchImap.main(new String[]{"200% cars " + System.lineSeparator()});
    }

    @Test
    void testMainNotOffloaded() throws Exception {
        TextSimilaritySearchImap.offloaded = false;
        TextSimilaritySearchImap.main(new String[]{"200% cars " + System.lineSeparator()});
    }
}
