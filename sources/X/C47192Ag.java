package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2Ag  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47192Ag {
    public static final AnonymousClass036 A00;
    public static final Charset A01;
    public static final Charset[] A02;

    static {
        List asList = Arrays.asList("AO", "CV", "GQ", "FR", "GW", "LU", "MO", "MZ", "PT", "ST", "CH", "TL");
        AnonymousClass036 anonymousClass036 = new AnonymousClass036(0);
        if (asList != null) {
            anonymousClass036.addAll(asList);
        }
        A00 = anonymousClass036;
        A01 = Charset.forName("US-ASCII");
        A02 = new Charset[]{Charset.forName("UTF-8"), Charset.forName("UTF-16BE")};
    }
}
