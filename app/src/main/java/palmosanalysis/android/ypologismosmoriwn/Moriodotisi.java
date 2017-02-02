package palmosanalysis.android.ypologismosmoriwn;

import java.util.UUID;

/**
 * Created by Win10 on 4/1/2017.
 */

public class Moriodotisi {
    private UUID mId;
    private int mMoria;
    private String mTitle;

    public Moriodotisi() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public int getMoria() {
        return mMoria;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
