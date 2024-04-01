package X;

import android.text.InputFilter;

/* renamed from: X.1EN  reason: invalid class name */
/* loaded from: classes.dex */
public class C1EN {
    public static final InputFilter[] A01 = new InputFilter[0];
    public static final AnonymousClass084 A00 = new AnonymousClass084("textForMeasure", 31);

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(X.C1E4 r6, X.C016807u r7, java.lang.String r8) {
        /*
            X.084 r0 = X.C25151Eg.A0A
            r5 = 0
            boolean r0 = r7.A8Z(r0, r5)
            if (r0 == 0) goto Lc
            r6.setPadding(r5, r5, r5, r5)
        Lc:
            if (r8 == 0) goto L1f
            android.text.Editable r0 = r6.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L1f
            r6.setText(r8)
        L1f:
            X.084 r1 = X.C25151Eg.A02
            X.085 r0 = r7.A00
            java.lang.Object r0 = r0.A00(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6.setHint(r0)
            X.084 r1 = X.C25151Eg.A0E
            X.085 r0 = r7.A00
            java.lang.Object r0 = r0.A00(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "TextInputBinderUtils"
            if (r0 == 0) goto L48
            int r0 = X.C08i.A05(r0)     // Catch: X.C018208m -> L42
            r6.setGravity(r0)     // Catch: X.C018208m -> L42
            goto L48
        L42:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text align"
            X.AnonymousClass088.A1j(r2, r0, r1)
        L48:
            X.084 r1 = X.C25151Eg.A01
            X.085 r0 = r7.A00
            java.lang.Object r0 = r0.A00(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L5b
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r5)
            r6.setTypeface(r0)
        L5b:
            X.084 r1 = X.C25151Eg.A0K
            X.085 r0 = r7.A00
            java.lang.Object r0 = r0.A00(r1)
            java.lang.String r0 = (java.lang.String) r0
            r3 = 0
            if (r0 == 0) goto L7a
            int r0 = X.C08i.A06(r0)     // Catch: X.C018208m -> L7c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: X.C018208m -> L7c
            int r0 = r4.intValue()     // Catch: X.C018208m -> L78
            r6.setInputType(r0)     // Catch: X.C018208m -> L78
            goto L83
        L78:
            r1 = move-exception
            goto L7e
        L7a:
            r4 = r3
            goto L83
        L7c:
            r1 = move-exception
            r4 = r3
        L7e:
            java.lang.String r0 = "Error parsing text input type"
            X.AnonymousClass088.A1j(r2, r0, r1)
        L83:
            X.084 r0 = X.C25151Eg.A0D
            boolean r0 = r7.A8Z(r0, r5)
            if (r0 == 0) goto L9c
            r0 = 1
            r6.setMaxLines(r0)
            r1 = -131073(0xfffffffffffdffff, float:NaN)
            if (r4 == 0) goto Laa
            int r0 = r4.intValue()
            r0 = r0 & r1
            r6.setInputType(r0)
        L9c:
            X.084 r1 = X.C25151Eg.A0H
            X.085 r0 = r7.A00
            java.lang.Object r0 = r0.A00(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lc1
            r1 = 2
            goto Lb3
        Laa:
            int r0 = r6.getInputType()
            r0 = r0 & r1
            r6.setInputType(r0)
            goto L9c
        Lb3:
            float r0 = X.C08i.A02(r0)     // Catch: X.C018208m -> Lbb
            r6.setTextSize(r1, r0)     // Catch: X.C018208m -> Lbb
            goto Lc1
        Lbb:
            r1 = move-exception
            java.lang.String r0 = "Error parsing scaled text size for text input"
            X.AnonymousClass088.A1j(r2, r0, r1)
        Lc1:
            X.084 r1 = X.C25151Eg.A0I
            X.085 r0 = r7.A00
            java.lang.Object r0 = r0.A00(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Ldb
            int r0 = X.C08i.A07(r0)     // Catch: X.C018208m -> Ld5
            r6.setTypeface(r3, r0)     // Catch: X.C018208m -> Ld5
            return
        Ld5:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text style for text input"
            X.AnonymousClass088.A1j(r2, r0, r1)
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1EN.A00(X.1E4, X.07u, java.lang.String):void");
    }
}
