package Warior;

import Shcild.Schild;

public abstract class WariorWithSchilds extends Warior{
    private Schild schild;

    public Schild getSchild() {
        return schild;
    }

    public void setSchild(Schild schild) {
        this.schild = schild;
    }
}
