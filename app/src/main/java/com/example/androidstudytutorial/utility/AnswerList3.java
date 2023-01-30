package com.example.androidstudytutorial.utility;

public class AnswerList3 {

    public static String Singelton = "Singleton is typically used to ensure that only one instance of a certain class exists during the entire lifecycle of an app. " +
            "This instance can be accessed from any part of the app, providing a centralized source of data or " +
            "functionality. " +
            "\n \nHere's an example of a thread-safe Singleton class in Java:\n\n public class Singleton {\n" +
            "    private static Singleton instance;\n" +
            "    private static final Object lock = new Object();\n" +
            "\n" +
            "    private Singleton() {\n" +
            "    }\n" +
            "\n" +
            "    public static Singleton getInstance() {\n" +
            "        if (instance == null) {\n" +
            "            synchronized (lock) {\n" +
            "                if (instance == null) {\n" +
            "                    instance = new Singleton();\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "        return instance;\n" +
            "    }\n" +
            "}\n"

            ;



    public static String Room = "Room is a persistence library for Android that provides an abstract layer over SQLite databases. It was introduced as part of the Android Architecture Components and is designed to simplify database operations in Android apps.\n" +
            "\n\n" +
            "The benefits of using Room over traditional SQLite databases in Android include:\n" +
            "\n" +
            "** Easy database migration: Room provides a simple API for updating the schema of your database, which makes it easier to handle changes to your database over time.\n" +
            "\n" +
            "** Compile-time verification: Room uses annotations and compile-time checks to validate the structure of your database, which helps catch errors early in development.\n" +
            "\n" +
            "** Simplified query syntax: Room provides a more concise and readable query syntax, compared to raw SQLite, making it easier to write and maintain complex database queries.\n" +
            "\n" +
            "** Better type safety: Room supports Java data types and performs automatic type conversions, making it easier to work with data in your app.\n" +
            "\n" +
            "** LiveData integration: Room integrates with LiveData, a component of the Android Architecture Components, to provide automatic updates of the data in your database when it changes.\n" +
            "\n\n" +
            "In summary, Room provides a more modern and user-friendly way to interact with databases in Android, with the benefits of increased type safety, improved query syntax, and easier database migrations.";



    public static  String Alarm = "AlarmManager and TimerTask are two classes in Android that are used to schedule events or actions to occur in the future.\n" +
            "\n\n" +
            "AlarmManager is a class that provides access to the system alarm services and allows  to schedule an alarm to be triggered at a specific time or after a specified interval. It can be used to start a service, send a broadcast, or wake up the device from sleep. Alarms are persisted across device reboots, making it useful for scheduling recurring events.\n" +
            "\n\n" +
            "TimerTask, on the other hand, is a class that represents a task that can be scheduled to run after a specified delay or at a fixed rate. It's used for performing an action at a specified time or after a certain amount of time has passed.\n" +
            "\n\n" +
            "While both classes can be used to schedule events, AlarmManager is generally recommended for long-term scheduling and TimerTask is more suited for short-term scheduling. The choice between the two classes often depends on the specific requirements of the task, such as whether the task needs to persist across device reboots or if it requires a specific time-interval.";







}
