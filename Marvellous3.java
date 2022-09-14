//1 one class can extend another class

class Base
{}

class Derived extends Base
{}
_____________________________________________________________
//2one class can implements one interface
interface Denmo
{}
class Hello implements Demo{}
_____________________________________________________________
//3.one class can implements more than one interface
interface Demo
{}
interface hello
{}
class Marvellous implements Demo,hello
{}
_____________________________________________________________
//4. one interface  can extends amother interface
interface hello
{}
interface Demo
{}
class Marvellous implements hello
{}
_____________________________________________________________
//5. one class can extend one class & impliment one interface
class Demo
{}
interface Hello
{}
class Mervellous extends Demo implements Hello,Demo