import 'package:dio/dio.dart';
import 'package:flutter/material.dart';
import 'package:get/get.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key}) : super(key: key);

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int x = 0;
  Controller controller = Controller();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        floatingActionButton: FloatingActionButton(
          onPressed: () => controller.fetchData(),
          child: Icon(Icons.add),
        ),
        appBar: AppBar(
          title: const Text("Vizyoner Genç"),
        ),
        body: Center(
          child: Obx(() => Text(controller.variable.value.toString())),
        ));
  }

  increment() {
    ++controller.variable;
    setState(() {});
  }
}

class Controller {
  var variable = 0.obs;

  increment() {
    variable.value++;
  }

  fetchData() async {
    Dio dio = Dio();
    final response =
        await dio.get("https://jsonplaceholder.typicode.com/todos/1");
    print(response.data);
  }
}
