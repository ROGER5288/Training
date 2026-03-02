package Lambda;

class Activities {
    int id;
    int start;
    int end;

    Activities(int id, int start, int end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return id + " " + start + " " + end;
    }
}
