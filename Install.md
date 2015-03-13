# Installing Ubiscript #

## Web Service Install ##

Install servlet/jsp container. we recommend [jetty-6.1.3](http://jetty.mortbay.org/jetty-6/) or [Tomcat 5.5/higher](http://tomcat.apache.org/).

_Note that you have to check "interact with desktop" property of the NT-service when you want to write GUI-enabled ubiscript programs._

## Ubiscript Server Install ##

Download .war file and simply unpack the file in the "webapp" directory.

## Installation Test ##

Open a web-browser and visit the local ubiscript test-client page. (e.g. http://localhost:8080/ubiscript-server/TestClient.jsp)

Type the following code in the form
```
var x = new JavaClass("javax.swing.JOptionPane");
x.showMessageDialog(null, "Hello, world");
```

If you can see a dialog, the installation is successful.