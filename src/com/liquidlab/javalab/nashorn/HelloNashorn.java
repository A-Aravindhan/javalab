/*
 * Copyright 2014 JavaLab
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liquidlab.javalab.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author  tham
 */
public class HelloNashorn {
    public void execute() {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");

        System.out.println("scriptEngine = " + scriptEngine);

        StringBuilder scriptBuilder = new StringBuilder();
//        scriptBuilder.append("var sayHello = function() {");
//        scriptBuilder.append("alert(\"Hi\");");
//        scriptBuilder.append("}\n");
//
//        scriptBuilder.append("sayHello();");

        scriptBuilder.append("print('Hello Javascript');");

        try {
            scriptEngine.eval(scriptBuilder.toString());
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new HelloNashorn().execute();
    }
}
