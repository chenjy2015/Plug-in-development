-injars PulgLibrary.jar
-outjars PulgLibrary_code.jar

-libraryjars 'C:\Program Files\Java\jre6\lib\rt.jar'
-libraryjars android-support-v4.jar
-libraryjars android.jar

-target 1.6
-useuniqueclassmembernames
-renamesourcefileattribute SourceFile
-adaptresourcefilenames **.properties
-adaptresourcefilecontents **.properties,META-INF/MANIFEST.MF
-verbose


# Keep - Library. Keep all public and protected classes, fields, and methods.
-keep public class * {
    public protected <fields>;
    public protected <methods>;
}

# Also keep - Enumerations. Keep the special static methods that are required in
# enumeration classes.
-keepclassmembers enum  * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# Keep names - Native method names. Keep all native class/method names.
-keepclasseswithmembers,allowshrinking class * {
    native <methods>;
}

# Remove debugging - Throwable_printStackTrace calls. Remove all invocations of
# Throwable.printStackTrace().
-assumenosideeffects public class java.lang.Throwable {
    public void printStackTrace();
}
