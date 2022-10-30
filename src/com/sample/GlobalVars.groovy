#!/usr/bin/env groovy
package com.sample

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.sample.GlobalVars
   // println GlobalVars.foo
}
