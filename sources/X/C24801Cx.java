package X;

import java.util.List;

/* renamed from: X.1Cx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24801Cx extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;
    public final List missingFields;

    public C24801Cx() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }
}
