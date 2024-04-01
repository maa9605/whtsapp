package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.2aZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52342aZ extends Thread {
    public final C018508q A00;
    public final C05W A01;
    public final C52332aY A02;
    public final C0LF A03;
    public volatile boolean A04;

    public C52342aZ(C52332aY c52332aY, C018508q c018508q, C05W c05w, C0LF c0lf) {
        super("ContactPhotosThread");
        this.A02 = c52332aY;
        this.A00 = c018508q;
        this.A01 = c05w;
        this.A03 = c0lf;
    }

    public final void A00(Bitmap bitmap, ImageView imageView, Object obj, InterfaceC52362ab interfaceC52362ab) {
        this.A00.A02.post(new RunnableEBaseShape0S0500000_I0(this, bitmap, imageView, obj, interfaceC52362ab, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
        r11 = r15.A03;
        r10 = r5.getContext().getContentResolver();
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d8, code lost:
        if (r11 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
        r0 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r10, android.content.ContentUris.withAppendedId(android.provider.ContactsContract.Contacts.CONTENT_URI, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
        r1 = android.graphics.BitmapFactory.decodeStream(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
        if (r1 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
        r9 = X.C0DD.A07(r1, r6, -1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
        r7.A00 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
        if (r9 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
        A00(r9, r5, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
        throw null;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52342aZ.run():void");
    }
}
