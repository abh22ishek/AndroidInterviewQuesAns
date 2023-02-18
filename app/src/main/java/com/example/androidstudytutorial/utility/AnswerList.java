package com.example.androidstudytutorial.utility;

public class AnswerList {

    public static String answers_01 = "1. Linux kernel: This is the core of the Android operating system, providing basic services such as device drivers, memory management, and security.\n" + "\n" +
            "2. Libraries: These are collections of pre-written code that developers can use to access system features, such as media playback, networking, and graphics.\n" + "\n" +
            "3. Android Runtime: This component provides the platform on which Android apps run, including the Dalvik Virtual Machine, which translates the app's bytecode into machine code that the device can execute.\n" + "\n" +
            "4. Application Framework: This layer provides developers with a set of APIs that they can use to build apps, including UI controls, activity management, and content providers.\n" + "\n" +
            "5. System Apps: These are pre-installed apps that come with the Android operating system, such as the Phone app, Messaging app, and Settings app.\n" + "\n" +
            "6. User Interface: This component includes the home screen, app launcher, notification shade, and other elements that users interact with to navigate and use their devices.";

    public static String answers_02 = "The compilation process for Android involves multiple stages, each with its own set of tools and steps.\n" +
            "\n" +
            "1. Java Compilation: The Android operating system is built using the Java programming language, so the first step in the compilation process involves compiling the Java code into bytecode.This step is performed using the Java compiler (javac).\n\n" +
            "2. Conversion to Dalvik bytecode: Dalvik is the virtual machine used by Android to run applications. The bytecode generated in step 1 is then converted to Dalvik bytecode using the dx tool.\n\n" +
            "3. Packaging resources: Android applications typically contain multiple resources, such as images, audio files, and layout files. These resources are compiled and packaged into a single binary file called an APK (Android Package).\n\n" +
            "4. APK Signing: In order to ensure the integrity and authenticity of the APK, it must be signed using a private key. The Android SDK includes tools to generate a private key and sign the APK.\n\n" +
            "5. Optimization: Once the APK is signed, it can be optimized for distribution. This process involves reducing the size of the APK, removing unused code and resources, and optimizing the code for faster execution. The Android SDK includes tools such as ProGuard and the Android Asset Packaging Tool (AAPT) for this purpose.\n\n\n" +
            "Distribution: Once the APK has been optimized, it is ready for distribution to users. This can be done through the Google Play Store, or through other distribution channels such as third-party app stores or direct download from a website.";


    public static String answers_activity_cycle = "\n" +
            "OnCreate(): This is when the view is first created. This is normally where we create views, get data from bundles etc.\n\n" +
            "OnStart(): Called when the activity is becoming visible to the user. Followed by onResume() if the activity comes to the foreground, or onStop() if it becomes hidden.\n\n" +
            "OnResume(): Called when the activity will start interacting with the user. At this point your activity is at the top of the activity stack, with user input going to it.\n\n" +
            "OnPause(): Called as part of the activity lifecycle when an activity is going into the background, but has not (yet) been killed.\n\n" +
            "OnStop(): Called when you are no longer visible to the user.\n\n" +
            "OnDestroy(): Called when the activity is finishing\n\n" +
            "OnRestart(): Called after your activity has been stopped, prior to it being started again\n";



    public static String answers_04 = "In Android, the AndroidManifest.xml file is an essential file that provides important information about the application to the Android operating system. It is located at the root of the application project directory and contains the following information:\n" +
            "\n" +
            "Application package name: This is a unique identifier for the application and is used to distinguish it from other applications.\n" +
            "\n" +
            "Application components: The AndroidManifest.xml file lists all the components of the application, such as activities, services, broadcast receivers, and content providers. It also specifies the intent filters that are associated with each component, which determine how the component can be launched.\n" +
            "\n" +
            "Minimum SDK version: This specifies the minimum version of the Android SDK that is required to run the application.\n" +
            "\n" +
            "Permissions: The AndroidManifest.xml file also lists the permissions that the application requires to access certain features of the device, such as the camera, internet, or location.\n" +
            "\n" +
            "Application metadata: The AndroidManifest.xml file can also include other metadata about the application, such as its name, version, and icon.\n" +
            "\n" +
            "Libraries : If the application uses any external library, this file is responsible for listing all the libraries that the application uses.\n" +
            "\n" +
            "The AndroidManifest.xml file is read by the Android operating system when the application is installed, and its information is used to" +

            " determine how the application should be launched and what resources it should have access to.";



    public static String intents = "In Android, an Intent is a message that is passed between components such as activities, services, and broadcast receivers. Intents allow for communication between different components of an app, " +
            "as well as between different apps."+"\n\n"
            +"Explicit Intents are used to launch a specific component within the same app, such as starting a new Activity or Service. The component to be launched is " +
            "specified by its class name."
            +"\n\n"
            +"Intent intent = new Intent(this, SecondActivity.class);\n" +
            "startActivity(intent);\n\n\n"
            + " Implicit Intents are used to launch any app that can handle the specified action or data. For example, you can use an implicit intent to open a web page in a browser, or to take a picture using the camera app. Implicit intents do not specify the component to be launched, but rather the action and " +
            "data to be performed."+"\n\n\n"
            +"Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(\"http://www.example.com\"));\n" +
            "startActivity(intent);\n"
            ;


    public static String fragments = "In Android, a Fragment represents a portion of the user interface and its associated logic. It is similar to an Activity, but it represents a part of the UI, whereas an Activity represents an entire screen. Fragments are used to create flexible and reusable UI elements that can be combined to create a" +
            " complete user interface.\n\n"

            +"Fragments have their own lifecycle, and can be added, removed, or replaced in the UI using a FragmentManager. They can also retain their state when the device is rotated " +
            "or the app is paused.\n\n"
            +" Fragments can communicate with the Activity that contains them in a few ways:"+"\n\n"+
            "1. Using the getActivity() method: A Fragment can call getActivity() to get a reference to the Activity that" +
            " contains it. The Activity can then be used to access its resources or perform other actions.\n\n"+
            "2. Using Interfaces: A Fragment can define an interface, and the Activity can implement it. The Fragment can then call the methods in the interface to communicate with the Activity."
            +"\n\n"+
            "3. Using ViewModel: With the introduction of Android Architecture Components, a Fragment can use a " +
            "ViewModel to hold and manage its data. The ViewModel is shared between the Fragment and the Activity, so any changes made to the ViewModel are automatically reflected in both.\n";


    public static String fragmentsLifecycle = "The lifecycle of a fragment in Android consists of several methods that are called at different points in the life of the fragment. \n" +
            "\n" +
            "These methods are:\n" +
            "\n" +
            "onAttach(): Called when the fragment is attached to an activity. This is a good place to initialize dependencies, such as the context of the activity.\n" +
            "\t\t\t\n" +
            "onCreate(): Called when the fragment is created. This is a good place to initialize variables and perform other setup tasks.\n" +
            "\n" +
            "onCreateView(): Called to inflate the fragment's user interface.This is where you create and return the view hierarchy that will be displayed in the fragment.\n" +
            "\t\t\t\t\n" +
            "onActivityCreated(): Called when the activity's onCreate() method has completed. This is a good place to perform any additional setup tasks that depend on the activity's state.\n" +
            "\t\t\t\n" +
            "onStart(): Called when the fragment becomes visible to the user. This is a good place to start animations or bind data to the user interface.\n" +
            "\t\t\t\n" +
            "onResume(): Called when the fragment becomes the active fragment in the activity. This is the best place to register listeners or bind to other components in the activity\n" +
            "\t\t\n" +
            "onPause(): Called when the fragment is no longer the active fragment in the activity.This is a good place to unregister listeners or perform other cleanup tasks.\n" +
            "\n" +
            "onPause(): Called when the fragment is no longer the active fragment in the activity. This is a good place to unregister listeners or perform other cleanup taks.\n" +
            "\t\t\n" +
            "onStop(): Called when the fragment becomes invisible to the user.This is a good place to stop animations or unbind data from the user interface.\n" +
            "\t\t\n" +
            "onDestroyView(): Called when the view hierarchy associated with the fragment is being destroyed.This is a good place to release resources associated with the view hierarchy, such as bitmaps or animations.\n" +
            "\t\t\t\n" +
            "onDestroy(): Called when fragment completely removed \n" +
            "\t\t\n" +
            "\t\t";

    public static String screen_sizes ="Density-independent pixels (dp or dip): Density-independent pixels are used to specify layout dimensions and font sizes. They are based on the physical density of the screen, and are designed to be the same size on all screens. For example, a button that is 40dp wide will be 40 pixels wide on a low-density screen and 80 pixels wide on a high-density screen.\n" +
            "\n" +
            "Resources: Android provides different resources for different screen sizes and densities. For example, you can provide different layouts for different screen sizes, or different images for different densities. Resources are organized in a specific folder structure and are selected automatically by the system at runtime.\n" +
            "\n" +
            "Adaptive layouts: Android provides several layout managers and widgets that can adapt to different screen sizes and orientations. For example, ConstraintLayout allows you to create flexible and responsive layouts that adjust to different screen sizes, and RecyclerView can adapt its layout depending on the available space.\n" +
            "\n" +
            "The support library: Android Support Library provides additional resources and classes that can help you create apps that work on different screen sizes and versions of Android. The library includes several classes for handling different screen sizes and densities, such as the Fragment class and the RecyclerView class.\n" +
            "\n" +
            "Scaling: Android also has the ability to scale the layout of the app automatically to fit different screens, this means that the layout will be automatically scaled to fit the screen, and the layout resources will be automatically scaled to fit the screen";


    public static String handlers =" Handler is a class that allows  to send and process messages and runnable objects within a background thread. Handlers are commonly used to perform time-consuming operations such as network or database operations, without blocking the main thread."
            +"\n\n"+"Handlers are typically used in the following ways:"+"\n"
            +"1. To post a runnable object to be executed in the background thread: The post() method can be used to post a runnable object to the message queue of the thread associated with the handler. This allows developers to perform background tasks without blocking the main thread."
            +"\n"+"Handler handler = new Handler();\n" +
            "handler.post(new Runnable() {\n" +
            "    public void run() {\n" +
            "        // perform background task\n" +
            "    }\n" +
            "});\n\n"+

            "2. To schedule a message or runnable to be executed after a specified delay: The postDelayed() method can be used to schedule a message or runnable to be executed after a specified delay. This is useful for tasks that need to be performed after a certain amount of time has passed."+
            "\n"+"Handler handler = new Handler();\n" +
            "handler.postDelayed(new Runnable() {\n" +
            "    public void run() {\n" +
            "        // perform task after delay\n" +
            "    }\n" +
            "}, 1000); // delay in milliseconds\n\n"
            +"3. To send messages between threads: The sendMessage() and handleMessage() " +
            "methods can be used to send and process messages between threads. " +
            "This allows developers to communicate between different threads, or to schedule" +
            " a message to be processed at a later time.\n"
            +"Handler handler = new Handler() {\n" +
            "    public void handleMessage(Message msg) {\n" +
            "        // process message\n" +
            "    }\n" +
            "};\n" +
            "\n" +
            "// send message from another thread\n" +
            "Message message = new Message();\n" +
            "message.what = 1;\n" +
            "handler.sendMessage(message);\n\n"
            +"4. To stop executing code: The removeCallbacks() method";
}