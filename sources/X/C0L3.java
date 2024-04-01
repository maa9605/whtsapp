package X;

import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;

/* renamed from: X.0L3  reason: invalid class name */
/* loaded from: classes.dex */
public enum C0L3 {
    UNKNOWN(0),
    CHROME(1),
    FIREFOX(2),
    IE(3),
    OPERA(4),
    SAFARI(5),
    EDGE(6),
    DESKTOP(7),
    IPAD(8),
    ANDROID_TABLET(9),
    OHANA(10),
    ALOHA(11),
    CATALINA(12);
    
    public final int value;

    C0L3(int i) {
        this.value = i;
    }

    public static C0L3 A00(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CHROME;
            case 2:
                return FIREFOX;
            case 3:
                return IE;
            case 4:
                return OPERA;
            case 5:
                return SAFARI;
            case 6:
                return EDGE;
            case 7:
                return DESKTOP;
            case 8:
                return IPAD;
            case 9:
                return ANDROID_TABLET;
            case 10:
                return OHANA;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return ALOHA;
            case 12:
                return CATALINA;
            default:
                return null;
        }
    }
}
