
// Scanner, BufferedReader, InputStreamReader
  Scanner sc = new Scanner(System.in);
  int i = sc.nextInt();
  String line = sc.nextLine();

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  br.nextLine();


// GDoc copy start
Collections:

List     - ArrayList, LinkedList, 
Stack    - Stack, LinkedList
Queue    - Queue, LinkedList, ArrayDeque
Set    - HashSet, TreeSet,
Map    - HashMap, TreeMap, LinkedHashMap, 

BitSet class - 

Thread class, Runnable interface, run and start methods.

Class methods:
equals(), toString(), hashCode(),

Arrays:
Arrays.sort(), binarySearch(), 

ArrayDeque:
ad.descendingIterator().

List:
Arrays.asList(1,2,3..);
lst.add(), get(), size(), addAll(), clear(), isEmpty(), contains(), indexOf(), remove(), sort(), subList(), hashCode()

Map:
put(), get(), putIfAbsent(), getOrDefault(), remove(), clear(), keySet(), entrySet(), containsKey(), containsValue(), size(), values(), isEmpty(), Map.Entry interface - getKey(), getValue(), setValue(), equals()

String:
charAt(), length(), subString(), join(), isEmpty(), split(), indexOf(), trim(), valueOf(), 

For split(), regex can be used like
s.split(“[ !?',;.]+”)

StringBuilder:

StringBuffer:

Queue:
add(), offer(), poll(), remove(), peek()

ByteBuffer: java.nio.ByteBuffer

Introselect: O(n) worst case for nth-element in a list

Keywords:
Interface, abstract class, abstract method, default methods, Comparator and Comparable interfaces, Iterator - hasNext(), next(); instanceof operator, final and finalize; Serializable interface, StringBuilder, String pools, 

public DerivedClass extends BaseClass;
public DerivedClass inherits Interface;

Exceptions:
try{} catch{} finally{};
throw and throws;
e.printStackTrace(), 

Serialization and Deserialization of objects

Abstraction, Inheritance, Encapsulation and Polymorphism, Overloading & overriding, default methods, 

Non-access modifiers: 
static, final, synchronized, transient, volatile, this, 

package, import, 

// GDoc copy end

// Data types
boolean, byte, short, int, float, long, double
Boolean, Byte, Short, Integer, Float, Long, Double

Integer.MAX_VALUE, Integer.MIN_VALUE

// keywords
static, volatile, synchronized, final, extends, implements, interface, class, enum, abstract class, 
  
// Exception handling
try-catch, throw, throws, finally
Exception()

// Garbage collection
System.gc(), Mark and Sweep, finalize(), 

// Threading
Thread - start(), run(), join(), wait(), notify(),
Runnable 
Callable - call(), Future 

// Sort methods
Arrays.sort() for primitive arrays
Collection.sort() for ArrayList, LinkedList etc
Arrays.sort(arr, Collections.reverseOrder())
Collections.sort(arrList, Collections.reverseOrder())

// Collections
PriorityQueue

Comparable, Comparator, compare(), compareTo()

Serializable 

ArrayList, LinkedList, List, Arrays, Stack, Queue, ArrayDeque, Map, HashMap, TreeMap, LinkedHashMap

// Object 
equals(), hashCode(), toString(), 

// String
String pool

StringBuilder

StringBuffer


Set, HashSet, TreeSet, LinkedHashSet, Map.Entry, 

Queue<Integer> q = new LinkedList();
offer(), poll(), size(), peek()
  
System.arraycopy(srcArr, srcPos, dstArr, dstPos, len);

Arrays.binarysearch() vs Collections.binarySearch()
