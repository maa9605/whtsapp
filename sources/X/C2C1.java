package X;

import android.os.AsyncTask;

/* renamed from: X.2C1 */
/* loaded from: classes2.dex */
public final class C2C1 extends AsyncTask {
    public final C0HS A00;

    public C2C1(C0HS c0hs) {
        this.A00 = c0hs;
    }

    public void A00(Object... objArr) {
        publishProgress(objArr);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object... objArr) {
        return this.A00.A07(objArr);
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        this.A00.A08();
    }

    @Override // android.os.AsyncTask
    public void onCancelled(Object obj) {
        this.A00.A01(obj);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        C0HS c0hs = this.A00;
        InterfaceC02360Aw interfaceC02360Aw = c0hs.A01;
        if (interfaceC02360Aw != null) {
            AbstractC02530Bu AAs = interfaceC02360Aw.AAs();
            ((C02520Bt) AAs).A01.A01(c0hs.A00);
        }
        c0hs.A09(obj);
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        this.A00.A06();
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Object... objArr) {
        this.A00.A03(objArr);
    }
}
