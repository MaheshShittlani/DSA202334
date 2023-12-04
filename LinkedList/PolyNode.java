public class PolyNode {
    private int coff;
    private int pow;
    private PolyNode link;
    
    public PolyNode(int coff, int pow) {
        this.coff = coff;
        this.pow = pow;
        this.link = null;
    }

        

    /**
     * @return int return the coff
     */
    public int getCoff() {
        return coff;
    }

    /**
     * @param coff the coff to set
     */
    public void setCoff(int coff) {
        this.coff = coff;
    }

    /**
     * @return int return the pow
     */
    public int getPow() {
        return pow;
    }

    /**
     * @param pow the pow to set
     */
    public void setPow(int pow) {
        this.pow = pow;
    }

    /**
     * @return PolyNode return the link
     */
    public PolyNode getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(PolyNode link) {
        this.link = link;
    }

}
