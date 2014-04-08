var StringBuilder = Java.type("java.lang.StringBuilder");
var builder = new StringBuilder();
builder.append("Java and Javascript interops \n");

print(builder.toString());

builder.append("Long live 'Nashorn'");
print(builder.toString());