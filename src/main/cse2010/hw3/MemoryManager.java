package cse2010.hw3;

/* Block will be used as a type argument */
class Block {
    public int size;
    public int start;
    public int end;

    /**
     * Constructs a block with the given size, start, and end.
     * @param size the size of the block
     * @param start the start index of the block
     * @param end the end index of the block
     */
    public Block(int size, int start, int end) {
        this.size = size;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "(" + size +", " + start + ", " + end + ")";
    }
}

public class MemoryManager {

    private final DLinkedList<Block> heap = new DLinkedList<>();

    /**
     * Constructs a memory manager with the given capacity.
     * @param capacity the capacity of the memory manager
     */
    public MemoryManager(int capacity) {
       /**/
    }

    /**
     * Allocates a block of memory with the given size.
     * @param size the size of the requested block
     * @return the allocated block
     * @throws OutOfMemoryException if there is no big-enough available block
     */
    public Block malloc(int size) {
        /**/
        return null;
    }

    /**
     * Returns the given block to the memory manager.
     * @param block the block to free (i.e, to return to the memory manager)
     */
    public void free(Block block) {
        /**/
    }

    /**
     * Returns the number of free blocks in the memory manager.
     * @return the number of free blocks in the memory manager
     */
    public int getFreeBlockCount() {
        return heap.getSize();
    }

    /**
     * Returns the total size of free blocks in the memory manager.
     * @return the total size of free blocks in the memory manager
     */
    public int getTotalFreeSize() {
        /**/
        return 0;
    }

    @Override
    public String toString() {
        return heap.toString();
    }
}


