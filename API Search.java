

Create an API to search employees and dependants

MyObject obj = new MyObject();
Method privateMethod = MyObject.class.getDeclaredMethod("getFoo", null);
privateMethod.setAccessible(true);
String returnValue = (String) privateMethod.invoke(obj, null);
System.out.println("returnValue = " + returnValue);