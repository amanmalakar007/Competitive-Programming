class PeekingIterator implements Iterator<Integer> {
    List<Integer> list;
    ListIterator<Integer> it;
	public PeekingIterator(Iterator<Integer> iterator) {
        list = new ArrayList<>();
        iterator.forEachRemaining(list::add);
        it = list.listIterator();
	}
	
	public Integer peek() {
        Integer toReturn = 0;
        if(it.hasNext())
        {
            toReturn = it.next();
            it.previous();
        }
        return toReturn;
	}
	
	@Override
	public Integer next() {
	    return (it.next());
	}
	
	@Override
	public boolean hasNext() {
	    return (it.hasNext());
	}
}