# jvm
java虚拟机


可以当做GC roots的对象有：
1.虚拟机栈中的引用对象
2.本地方法栈中的JNI的引用的对象
3.方法区中类静态属性引用的对象
4.方法区中的常量引用的对象


### 垃圾回收算法
#### 标记清除
#### 复制
#### 标记整理
#### 分代收集
#### 增量收集

### 垃圾收集器
#### Serial
单线程收集器
#### Serial Old
Serial的老年代版本
#### ParNew
Serial的多线程版本
#### Parallel Scavenge

#### Parallel Old

#### CMS
初始标记->并发标记->重新标记->并发清除
#### G1
初始标记->并发标记->重新标记->并发整理
### [jvm面试题及答案](https://github.com/chenshi178/mywork/blob/master/jvm/Interview.MD)



