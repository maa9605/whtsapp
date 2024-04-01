package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2EX */
/* loaded from: classes2.dex */
public class C2EX implements InterfaceC04070Ih {
    public C06C A00;
    public WeakReference A01;
    public final C018508q A02;
    public final C018708s A03;
    public final C000400f A04;
    public final AnonymousClass011 A05;

    public C2EX(C018508q c018508q, AnonymousClass011 anonymousClass011, C018708s c018708s, C000400f c000400f, Activity activity, C06C c06c) {
        this.A02 = c018508q;
        this.A05 = anonymousClass011;
        this.A03 = c018708s;
        this.A04 = c000400f;
        this.A01 = new WeakReference(activity);
        this.A00 = c06c;
    }

    public void A00(int i, int i2, int i3, Object... objArr) {
        WeakReference weakReference = this.A01;
        if (weakReference == null) {
            Log.i("basemediadownloadlistener/notifyuser/skip");
            return;
        }
        Activity activity = (Activity) weakReference.get();
        if (activity != null && !C002701i.A1P(activity) && this.A02.A00 == activity) {
            C0B5 c0b5 = (C0B5) activity;
            if (i == 4) {
                c0b5.AUk(i2, i3, R.string.manage_storage_button_text, new C78593kC(activity, C40731sm.A0N(4, this.A05), 4), objArr);
                return;
            } else {
                c0b5.AUl(i2, i3, objArr);
                return;
            }
        }
        Log.i("basemediadownloadlistener/notifyuser/skip");
    }

    public void A01(C04020Ic c04020Ic) {
        Activity activity;
        Activity activity2;
        if (!(this instanceof C2EW)) {
            WeakReference weakReference = this.A01;
            if (weakReference == null) {
                activity2 = null;
            } else {
                activity2 = (Activity) weakReference.get();
                if (activity2 == null || C002701i.A1P(activity2) || this.A02.A00 != activity2) {
                    activity2 = null;
                }
            }
            if (activity2 == null) {
                Log.i("basemediadownloadlistener/notifyuser/skip");
                return;
            }
            int i = c04020Ic.A01;
            if (i == 9) {
                C000400f c000400f = this.A04;
                if (c000400f.A0A(new C2EV(c000400f, activity2))) {
                    A00(i, R.string.download_failed, R.string.unable_to_finish_download, new Object[0]);
                    return;
                }
                return;
            } else if (i == 4) {
                A00(i, R.string.download_failed, R.string.insufficient_storage_dialog_subtitle, new Object[0]);
                return;
            } else if (i == 5) {
                C06C c06c = this.A00;
                if (c06c != null) {
                    A00(i, R.string.download_failed, R.string.too_old_for_download, this.A03.A08(c06c, false));
                    return;
                } else {
                    A00(i, R.string.download_failed, R.string.invalid_url_for_download, new Object[0]);
                    return;
                }
            } else if (i != 8 && i != -1) {
                A00(i, R.string.download_failed, R.string.unable_to_finish_download, new Object[0]);
                return;
            } else {
                A00(i, R.string.download_failed, R.string.invalid_url_for_download, new Object[0]);
                return;
            }
        }
        WeakReference weakReference2 = this.A01;
        if (weakReference2 == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference2.get();
            if (activity == null || C002701i.A1P(activity) || this.A02.A00 != activity) {
                activity = null;
            }
        }
        if (activity == null) {
            Log.i("productdownloadlistener/notifyuser/skip");
            return;
        }
        int i2 = c04020Ic.A01;
        if (i2 == 9) {
            C000400f c000400f2 = this.A04;
            if (c000400f2.A0A(new C2EV(c000400f2, activity))) {
                A00(i2, R.string.product_image_download_failed, R.string.unable_to_finish_download_product_image, new Object[0]);
            }
        } else if (i2 == 4) {
            boolean A01 = C000400f.A01();
            int i3 = R.string.insufficient_space_for_download_product_image_shared_storage;
            if (A01) {
                i3 = R.string.insufficient_space_for_download_product_image;
            }
            A00(i2, R.string.product_image_download_failed, i3, new Object[0]);
        } else if (i2 == 5) {
            A00(i2, R.string.product_image_download_failed, R.string.product_image_download_failed_too_old, new Object[0]);
        } else if (i2 == 8 || i2 == -1) {
            A00(i2, R.string.product_image_download_failed, R.string.invalid_url_for_product_image_download, new Object[0]);
        } else {
            A00(i2, R.string.product_image_download_failed, R.string.unable_to_finish_download_product_image, new Object[0]);
        }
    }

    @Override // X.InterfaceC04070Ih
    public void AJX(boolean z) {
        this.A01 = null;
    }

    @Override // X.InterfaceC04070Ih
    public void AJY(C04020Ic c04020Ic, C43211x2 c43211x2) {
        if (!(this instanceof C68673Ky)) {
            if (!(this instanceof C68663Kx)) {
                if (c04020Ic.A02()) {
                    return;
                }
                A01(c04020Ic);
                this.A01 = null;
                return;
            }
            C68663Kx c68663Kx = (C68663Kx) this;
            if (c04020Ic.A02()) {
                C47392Ba c47392Ba = c68663Kx.A00;
                synchronized (c47392Ba) {
                    Log.i("gdpr/on-report-downloaded");
                    C000200d.A0g(c47392Ba.A0D, "gdpr_report_state", 3);
                }
            } else {
                int i = c04020Ic.A01;
                if (i == 5 || i == 8) {
                    c68663Kx.A00(i, R.string.download_failed, R.string.gdpr_download_expired, new Object[0]);
                    c68663Kx.A00.A05();
                } else if (i == 4) {
                    c68663Kx.A00(i, R.string.download_failed, R.string.insufficient_space_for_download_shared_storage, new Object[0]);
                } else {
                    c68663Kx.A01(c04020Ic);
                }
            }
            c68663Kx.A01 = null;
            return;
        }
        C68673Ky c68673Ky = (C68673Ky) this;
        if (c04020Ic.A02()) {
            return;
        }
        int i2 = c04020Ic.A01;
        if (i2 == 9) {
            if (c68673Ky.A02) {
                return;
            }
            c68673Ky.A01(c04020Ic);
            c68673Ky.A02 = true;
        } else if (i2 == 4) {
            if (c68673Ky.A00) {
                return;
            }
            c68673Ky.A01(c04020Ic);
            c68673Ky.A00 = true;
        } else if (i2 != 2 && i2 != 3 && i2 != 11) {
            c68673Ky.A01(c04020Ic);
        } else if (c68673Ky.A01) {
        } else {
            c68673Ky.A01(c04020Ic);
            c68673Ky.A01 = true;
        }
    }
}
