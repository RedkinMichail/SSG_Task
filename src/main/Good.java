public class Good {
    String nameOfGood;
    String[] tags;
    public Good(String nameOfGood, String... tags) {
        this.nameOfGood = nameOfGood;
        this.tags = new String[tags.length];
        int i = 0;
        for (String tag : tags) {
            this.tags[i++] = tag;
        }
    }
    public String getNameOfGood() {
        return nameOfGood;
    }

    public boolean isRelatedGood(Good good) {
        if (this.equals(good)) {
            return false;
        }
        for (int i = 0; i < this.tags.length; i++) {
            for (int j = 0; j < good.tags.length; j++) {
                if (this.tags[i].equals(good.tags[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Good)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Good good = (Good)obj;
        if (!this.getNameOfGood().equals(good.getNameOfGood())) {
            return false;
        }
        return true;
    }
}
