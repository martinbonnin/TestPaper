# TestPaper

A simple test app to test the transition from paper 1.5 to 2.1

It crashes with the stack trace below:



            09-19 21:50:25.604 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Running on Android platform. Use of sun.misc.Unsafe should be disabled
            09-19 21:50:25.605 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo.FieldSerializerConfig] useAsm: true
            09-19 21:50:25.605 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo.FieldSerializerConfig] useAsm: true
            09-19 21:50:25.634 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 0: int (com.esotericsoftware.kryo.serializers.DefaultSerializers$IntSerializer)
            09-19 21:50:25.635 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 1: String (com.esotericsoftware.kryo.serializers.DefaultSerializers$StringSerializer)
            09-19 21:50:25.635 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 2: float (com.esotericsoftware.kryo.serializers.DefaultSerializers$FloatSerializer)
            09-19 21:50:25.635 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 3: boolean (com.esotericsoftware.kryo.serializers.DefaultSerializers$BooleanSerializer)
            09-19 21:50:25.636 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 4: byte (com.esotericsoftware.kryo.serializers.DefaultSerializers$ByteSerializer)
            09-19 21:50:25.636 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 5: char (com.esotericsoftware.kryo.serializers.DefaultSerializers$CharSerializer)
            09-19 21:50:25.638 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 6: short (com.esotericsoftware.kryo.serializers.DefaultSerializers$ShortSerializer)
            09-19 21:50:25.638 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 7: long (com.esotericsoftware.kryo.serializers.DefaultSerializers$LongSerializer)
            09-19 21:50:25.639 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 8: double (com.esotericsoftware.kryo.serializers.DefaultSerializers$DoubleSerializer)
            09-19 21:50:25.639 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 9: void (com.esotericsoftware.kryo.serializers.DefaultSerializers$VoidSerializer)
            09-19 21:50:25.640 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Optimize ints: true
            09-19 21:50:25.642 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Field mContent: class java.lang.Object
            09-19 21:50:25.643 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 10: io.paperdb.PaperTable (com.esotericsoftware.kryo.serializers.FieldSerializer)
            09-19 21:50:25.643 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] References: false
            09-19 21:50:25.643 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 11: java.util.Arrays$ArrayList (de.javakaffee.kryoserializers.ArraysAsListSerializer)
            09-19 21:50:25.645 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 12: java.util.Collections$UnmodifiableCollection (de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer)
            09-19 21:50:25.645 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 13: java.util.Collections$UnmodifiableRandomAccessList (de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer)
            09-19 21:50:25.645 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 14: java.util.Collections$UnmodifiableList (de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer)
            09-19 21:50:25.645 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 15: java.util.Collections$UnmodifiableSet (de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer)
            09-19 21:50:25.645 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 16: java.util.Collections$UnmodifiableSortedSet (de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer)
            09-19 21:50:25.646 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 17: java.util.Collections$UnmodifiableMap (de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer)
            09-19 21:50:25.646 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 18: java.util.Collections$UnmodifiableSortedMap (de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer)
            09-19 21:50:25.647 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 19: java.util.Collections$SynchronizedCollection (de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer)
            09-19 21:50:25.647 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 20: java.util.Collections$SynchronizedRandomAccessList (de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer)
            09-19 21:50:25.648 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 21: java.util.Collections$SynchronizedList (de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer)
            09-19 21:50:25.648 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 22: java.util.Collections$SynchronizedSet (de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer)
            09-19 21:50:25.648 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 23: java.util.Collections$SynchronizedSortedSet (de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer)
            09-19 21:50:25.648 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 24: java.util.Collections$SynchronizedMap (de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer)
            09-19 21:50:25.648 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 25: java.util.Collections$SynchronizedSortedMap (de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer)
            09-19 21:50:25.649 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class ID 26: java.util.UUID (de.javakaffee.kryoserializers.UUIDSerializer)
            09-19 21:50:25.650 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read field: mContent (io.paperdb.PaperTable) pos=0
            09-19 21:50:25.650 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read class name: java.util.ArrayList
            09-19 21:50:25.651 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class name: java.util.ArrayList (com.esotericsoftware.kryo.serializers.CollectionSerializer)
            09-19 21:50:25.652 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read class name: testpaper.mbonnin.net.testpaper.Recipe
            09-19 21:50:25.654 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Optimize ints: true
            09-19 21:50:25.654 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Field duration: int
            09-19 21:50:25.654 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Field ingredients: class java.util.HashMap
            09-19 21:50:25.655 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Field name: class java.lang.String
            09-19 21:50:25.655 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class name: testpaper.mbonnin.net.testpaper.Recipe (com.esotericsoftware.kryo.serializers.CompatibleFieldSerializer)
            09-19 21:50:25.655 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read 3 field names.
            09-19 21:50:25.656 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read chunk: 1
            09-19 21:50:25.656 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read chunk: 0
            09-19 21:50:25.656 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Next chunks.
            09-19 21:50:25.656 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read field: ingredients (testpaper.mbonnin.net.testpaper.Recipe) pos=1
            09-19 21:50:25.656 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read chunk: 46
            09-19 21:50:25.656 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read chunk: 0
            09-19 21:50:25.656 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read class name: java.util.HashMap
            09-19 21:50:25.657 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Register class name: java.util.HashMap (com.esotericsoftware.kryo.serializers.MapSerializer)
            09-19 21:50:25.658 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Object graph complete.
            09-19 21:50:25.658 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo.FieldSerializerConfig] setOptimizedGenerics: true
            09-19 21:50:25.658 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read field: mContent (io.paperdb.PaperTable) pos=0
            09-19 21:50:25.658 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read class name: java.util.ArrayList
            09-19 21:50:25.659 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read class name: testpaper.mbonnin.net.testpaper.Recipe
            09-19 21:50:25.659 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read 3 field names.
            09-19 21:50:25.659 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read chunk: 1
            09-19 21:50:25.659 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read chunk: 0
            09-19 21:50:25.659 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Next chunks.
            09-19 21:50:25.659 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read field: ingredients (testpaper.mbonnin.net.testpaper.Recipe) pos=1
            09-19 21:50:25.659 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read chunk: 46
            09-19 21:50:25.659 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read chunk: 0
            09-19 21:50:25.660 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Read class name: java.util.HashMap
            09-19 21:50:25.660 30997-30997/testpaper.mbonnin.net.testpaper I/System.out: 00:00 TRACE: [kryo] Object graph complete.
            09-19 21:50:25.665 30997-30997/testpaper.mbonnin.net.testpaper E/AndroidRuntime: FATAL EXCEPTION: main
            Process: testpaper.mbonnin.net.testpaper, PID: 30997
            java.lang.RuntimeException: Unable to start activity ComponentInfo{testpaper.mbonnin.net.testpaper/testpaper.mbonnin.net.testpaper.MainActivity}: io.paperdb.PaperDbException: Couldn't read/deserialize file /data/user/0/testpaper.mbonnin.net.testpaper/files/io.paperdb/cookbook.pt for table cookbook
            at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2817)
            at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2892)
            at android.app.ActivityThread.-wrap11(Unknown Source:0)
            at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1593)
            at android.os.Handler.dispatchMessage(Handler.java:105)
            at android.os.Looper.loop(Looper.java:164)
            at android.app.ActivityThread.main(ActivityThread.java:6541)
            at java.lang.reflect.Method.invoke(Native Method)
            at com.android.internal.os.Zygote$MethodAndArgsCaller.run(Zygote.java:240)
            at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:767)
            Caused by: io.paperdb.PaperDbException: Couldn't read/deserialize file /data/user/0/testpaper.mbonnin.net.testpaper/files/io.paperdb/cookbook.pt for table cookbook
            at io.paperdb.DbStoragePlainFile.readTableFile(DbStoragePlainFile.java:281)
            at io.paperdb.DbStoragePlainFile.readTableFile(DbStoragePlainFile.java:270)
            at io.paperdb.DbStoragePlainFile.readTableFile(DbStoragePlainFile.java:248)
            at io.paperdb.DbStoragePlainFile.select(DbStoragePlainFile.java:147)
            at io.paperdb.Book.read(Book.java:68)
            at io.paperdb.Book.read(Book.java:53)
            at testpaper.mbonnin.net.testpaper.MainActivity.onCreate(MainActivity.java:24)
            at android.app.Activity.performCreate(Activity.java:6975)
            at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1213)
            at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2770)
            at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2892) 
            at android.app.ActivityThread.-wrap11(Unknown Source:0) 
            at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1593) 
            at android.os.Handler.dispatchMessage(Handler.java:105) 
            at android.os.Looper.loop(Looper.java:164) 
            at android.app.ActivityThread.main(ActivityThread.java:6541) 
            at java.lang.reflect.Method.invoke(Native Method) 
            at com.android.internal.os.Zygote$MethodAndArgsCaller.run(Zygote.java:240) 
            at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:767) 
            Caused by: com.esotericsoftware.kryo.KryoException: Encountered unregistered class ID: 99
            Serialization trace:
            ingredients (testpaper.mbonnin.net.testpaper.Recipe)
            mContent (io.paperdb.PaperTable)
            at com.esotericsoftware.kryo.util.DefaultClassResolver.readClass(DefaultClassResolver.java:137)
            at com.esotericsoftware.kryo.Kryo.readClass(Kryo.java:693)
            at com.esotericsoftware.kryo.Kryo.readClassAndObject(Kryo.java:804)
            at com.esotericsoftware.kryo.serializers.MapSerializer.read(MapSerializer.java:153)
            at com.esotericsoftware.kryo.serializers.MapSerializer.read(MapSerializer.java:39)
            at com.esotericsoftware.kryo.Kryo.readObject(Kryo.java:734)
            at com.esotericsoftware.kryo.serializers.ObjectField.read(ObjectField.java:125)
            at com.esotericsoftware.kryo.serializers.CompatibleFieldSerializer.read(CompatibleFieldSerializer.java:147)
            at com.esotericsoftware.kryo.Kryo.readClassAndObject(Kryo.java:816)
            at com.esotericsoftware.kryo.serializers.CollectionSerializer.read(CollectionSerializer.java:134)
            at com.esotericsoftware.kryo.serializers.CollectionSerializer.read(CollectionSerializer.java:40)
            at com.esotericsoftware.kryo.Kryo.readObject(Kryo.java:734)
            at com.esotericsoftware.kryo.serializers.ObjectField.read(ObjectField.java:125)
            at com.esotericsoftware.kryo.serializers.FieldSerializer.read(FieldSerializer.java:540)
            at com.esotericsoftware.kryo.Kryo.readObject(Kryo.java:712)
            at io.paperdb.DbStoragePlainFile.readTableFile(DbStoragePlainFile.java:261)
            ... 18 more
