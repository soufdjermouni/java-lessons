# Stream Exception 

```java 
public static void main(String[] args) {
    List<String> myList = Arrays.asList("e1","e2","e3");
    myList.stream()
    .map(item -> {
        try {
        return doSomething(item);
        } catch (IOException e) {
        throw new RuntimeException(e);
      }
    })
    .forEach(System.out::println);//E1 E2 E3
}

private static String doSomething(String item) throws IOException {
    if(null == item) throw new IOException();
    return item.toUpperCase();
}
``` 
Un autre façon  

```
    public void process() {
        myList.stream()
        .map(this::trySomething)
        .forEach(System.out::println);
    }    
    public String trySomething(String item) {
        try {
            return doSomething(item);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
```