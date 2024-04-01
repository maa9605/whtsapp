package android.support.v4.media;

import X.C006702y;
import X.C10330fo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final C006702y A01;
    public static final Parcelable.Creator CREATOR;
    public final Bundle A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        C006702y c006702y = new C006702y();
        A01 = c006702y;
        c006702y.put("android.media.metadata.TITLE", 1);
        C006702y c006702y2 = A01;
        c006702y2.put("android.media.metadata.ARTIST", 1);
        c006702y2.put("android.media.metadata.DURATION", 0);
        c006702y2.put("android.media.metadata.ALBUM", 1);
        c006702y2.put("android.media.metadata.AUTHOR", 1);
        c006702y2.put("android.media.metadata.WRITER", 1);
        c006702y2.put("android.media.metadata.COMPOSER", 1);
        c006702y2.put("android.media.metadata.COMPILATION", 1);
        c006702y2.put("android.media.metadata.DATE", 1);
        c006702y2.put("android.media.metadata.YEAR", 0);
        c006702y2.put("android.media.metadata.GENRE", 1);
        c006702y2.put("android.media.metadata.TRACK_NUMBER", 0);
        c006702y2.put("android.media.metadata.NUM_TRACKS", 0);
        c006702y2.put("android.media.metadata.DISC_NUMBER", 0);
        c006702y2.put("android.media.metadata.ALBUM_ARTIST", 1);
        c006702y2.put("android.media.metadata.ART", 2);
        c006702y2.put("android.media.metadata.ART_URI", 1);
        c006702y2.put("android.media.metadata.ALBUM_ART", 2);
        c006702y2.put("android.media.metadata.ALBUM_ART_URI", 1);
        c006702y2.put("android.media.metadata.USER_RATING", 3);
        c006702y2.put("android.media.metadata.RATING", 3);
        c006702y2.put("android.media.metadata.DISPLAY_TITLE", 1);
        c006702y2.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c006702y2.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c006702y2.put("android.media.metadata.DISPLAY_ICON", 2);
        c006702y2.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c006702y2.put("android.media.metadata.MEDIA_ID", 1);
        c006702y2.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c006702y2.put("android.media.metadata.MEDIA_URI", 1);
        c006702y2.put("android.media.metadata.ADVERTISEMENT", 0);
        c006702y2.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new Parcelable.Creator() { // from class: X.0fc
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new MediaMetadataCompat[i];
            }
        };
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.A00 = parcel.readBundle(C10330fo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }
}
