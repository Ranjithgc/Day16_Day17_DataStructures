package hashmap;

//A node of chains
public class HashMap<K, V> {
	K key;
	V value;
	HashMap<K, V> next;

	HashMap(K key, V value) {
		this.key = key;
		this.value = value;
	}
}