import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class SecondPartion {
	static int counts = 0;// 计算比较个数
	public static List<Integer> binarySort(List<Integer> list, int num) {
		int h, l, middle;
		l = 0;// 查找区间上界
		h = list.size() - 1;// 查找区间下界
		while (l <= h) {
			counts++;
			middle = (l + h) / 2;// 找中间值
			if (num < list.get(middle)) {// 如果待插入记录比中间记录小
				h = middle - 1;// 插入点在低半区
			} else {
				l = middle + 1;
			}
		}
		list.add(l, num);// 将待插入记录回填到正确位置
		return list;
	}

	public static void method3(int n) {
		List<Integer> list = new ArrayList<Integer>();// 用来保存排好序列的数据
		for (int i = 0; i < n; i++) {
				Random r=new Random();
				int num =r.nextInt(200);
			if (list.size() == 0) {
				list.add(num);
				counts++;
			} else {
				list = binarySort(list, num);
			}
			System.out.print("第" + list.size() + "次的排序结果为：");
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + "\t");
			}
			System.out.println();
		}
		System.out.println("计算次数为：" + counts);
	}

	public static void main(String[] args) {

		method3(10);
	}
}