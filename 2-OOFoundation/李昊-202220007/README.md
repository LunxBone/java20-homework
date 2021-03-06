**定义类：**

根据题目要求，可定义三个类：

1. 葫芦娃类：定义单个葫芦娃所具有的属性与方法；属性为：姓名`name`与位次`index`；方法为：葫芦娃心里比较自己与别的葫芦娃的位次，哪个高哪个低；
2. 爷爷类：属性：爷爷有一群葫芦娃们（List）；方法：给葫芦娃们排序
3. 葫芦娃群体类：属性：一群葫芦娃们；方法：group中，葫芦娃们可以互相交换，并且通过相互协作的排序



**Orchestration思路：**

通过爷爷类中的方法来让葫芦娃们排序，排序依照每个葫芦娃的位次，因为是指挥葫芦娃们排序，所以排序方法任意，通常的快排、选排、插排都可以，因为可以直接操作单个元素进行排序。此处使用Java自带的排序`Collections.sort()`，并通过`Comparator`来选定通过比较位次来进行排序



**Choreography思路**：

此过程主要运用到冒泡排序，考虑到需要葫芦娃们相互协作，所以葫芦娃群体类中应该具有交换两个任意葫芦娃的位置的功能`exchange`，虽然动作的发生者是单个葫芦娃，但是这个过程是在群体中发生，所以是写在葫芦娃群体类中的方法。此外排序的指标是每个葫芦娃比较自己的位次与后一个葫芦娃的位次，这个动作发生在葫芦娃自己心里，所以写在葫芦娃类中。方法主要是冒泡排序，因为是需要让每个葫芦娃依次进行比较和两两交换，需要每个人协作完成，所以采用此方法。



另：源码中写了两个`@Test`类来测试两种方法。