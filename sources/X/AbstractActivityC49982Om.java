package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.qrcode.contactqr.ContactQrActivity;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment;
import com.whatsapp.qrcode.contactqr.ErrorDialogFragment;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.2Om */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC49982Om extends C2On implements InterfaceC05810Qi {
    public long A00;
    public Uri A01;
    public ImageView A02;
    public ViewPager A03;
    public C04480Ki A04;
    public C02L A05;
    public PagerSlidingTabStrip A06;
    public C05W A07;
    public C42371vd A08;
    public AnonymousClass075 A09;
    public C2L9 A0A;
    public C0E7 A0B;
    public C02F A0C;
    public C002301c A0D;
    public C0CA A0E;
    public AnonymousClass011 A0F;
    public C05Y A0G;
    public C41681uL A0H;
    public C0DW A0I;
    public C0DV A0J;
    public C70813Ts A0K;
    public C50692Su A0L;
    public C85963wZ A0M;
    public ContactQrMyCodeFragment A0N;
    public QrScanCodeFragment A0O;
    public C41961un A0P;
    public InterfaceC002901k A0Q;
    public String A0R;
    public String A0S;
    public boolean A0T;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0U = false;
    public final InterfaceC70823Tt A0Y = new InterfaceC70823Tt() { // from class: X.3lm
        {
            AbstractActivityC49982Om.this = this;
        }

        @Override // X.InterfaceC70823Tt
        public final void AOB(String str, int i) {
            final AbstractActivityC49982Om abstractActivityC49982Om = AbstractActivityC49982Om.this;
            if (!abstractActivityC49982Om.AFE()) {
                abstractActivityC49982Om.A0V = false;
                abstractActivityC49982Om.ARS();
                if (i == 0) {
                    C019208x c019208x = new C019208x(abstractActivityC49982Om);
                    c019208x.A06(R.string.ok, null);
                    c019208x.A02(R.string.error_load_image);
                    c019208x.A01.A07 = new DialogInterface.OnDismissListener() { // from class: X.3U5
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            abstractActivityC49982Om.ANV();
                        }
                    };
                    c019208x.A00().show();
                    ((AbstractC50702Sv) abstractActivityC49982Om.A0L).A0D = true;
                } else if (i != 1) {
                    if (i == 2 && !abstractActivityC49982Om.A1U(str, false, 3)) {
                        C50692Su c50692Su = abstractActivityC49982Om.A0L;
                        ((AbstractC50702Sv) c50692Su).A01.AUg(ErrorDialogFragment.A00(6), "qr_code_scanning_dialog_fragment_tag");
                        ((AbstractC50702Sv) abstractActivityC49982Om.A0L).A0D = true;
                    }
                } else {
                    AnonymousClass029.A1F(abstractActivityC49982Om.A0F, 3, 1, null, null, null, null, AnonymousClass029.A1X(str));
                    C50692Su c50692Su2 = abstractActivityC49982Om.A0L;
                    ((AbstractC50702Sv) c50692Su2).A01.AUg(ErrorDialogFragment.A00(6), "qr_code_scanning_dialog_fragment_tag");
                    ((AbstractC50702Sv) abstractActivityC49982Om.A0L).A0D = true;
                }
            }
        }
    };

    @Override // X.ActivityC02290Ap, X.ActivityC02330At
    public void A0W(C0BA c0ba) {
        super.A0W(c0ba);
        if (c0ba instanceof ContactQrMyCodeFragment) {
            ContactQrMyCodeFragment contactQrMyCodeFragment = (ContactQrMyCodeFragment) c0ba;
            this.A0N = contactQrMyCodeFragment;
            String str = this.A0R;
            if (str != null) {
                contactQrMyCodeFragment.A02 = str;
                ContactQrContactCardView contactQrContactCardView = contactQrMyCodeFragment.A01;
                if (contactQrContactCardView != null) {
                    contactQrContactCardView.setQrCode(C000200d.A0H("https://wa.me/qr/", str));
                }
            }
        } else if (!(c0ba instanceof QrScanCodeFragment)) {
        } else {
            this.A0O = (QrScanCodeFragment) c0ba;
            ViewPager viewPager = this.A03;
            if (viewPager == null) {
                Log.e("BaseQrActivity/onAttachFragment/viewPagerNull");
            } else if (1 != viewPager.getCurrentItem()) {
            } else {
                A1R();
            }
        }
    }

    public final int A1P(int i) {
        boolean A0M = this.A0D.A0M();
        if (i != 0) {
            if (i != 1) {
                return -1;
            }
            return A0M ? 1 : 0;
        }
        return !A0M ? 1 : 0;
    }

    public void A1Q() {
        if (!this.A0C.A06()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_sharing_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_sharing;
            }
            A15(RequestPermissionActivity.A01(this, R.string.permission_storage_need_write_access_on_sharing_request, i2, false), 4);
        } else if (this.A0R == null) {
            Log.e("BaseQrActivity/shareFailed/noQr");
            ((ActivityC02290Ap) this).A0A.A07(R.string.share_failed, 0);
        } else {
            ContactQrActivity contactQrActivity = (ContactQrActivity) this;
            contactQrActivity.A12(R.string.contact_qr_wait);
            InterfaceC002901k interfaceC002901k = contactQrActivity.A0Q;
            C79453lg c79453lg = new C79453lg(contactQrActivity.A01, contactQrActivity.A02, contactQrActivity.A00, contactQrActivity, contactQrActivity.getString(R.string.contact_qr_email_body_with_link, C000200d.A0H("https://wa.me/qr/", contactQrActivity.A0R)));
            Bitmap[] bitmapArr = new Bitmap[1];
            C02L c02l = contactQrActivity.A02;
            c02l.A05();
            C0K1 c0k1 = c02l.A01;
            if (c0k1 != null) {
                bitmapArr[0] = AnonymousClass029.A0D(contactQrActivity, c0k1, ((ActivityC02290Ap) contactQrActivity).A0F.A00.getInt("privacy_profile_photo", 0) == 0, C000200d.A0H("https://wa.me/qr/", contactQrActivity.A0R), contactQrActivity.getString(R.string.contact_qr_share_prompt));
                interfaceC002901k.ARy(c79453lg, bitmapArr);
                return;
            }
            throw null;
        }
    }

    public final void A1R() {
        if (this.A0O != null) {
            if (this.A0C.A02("android.permission.CAMERA") != 0) {
                startActivityForResult(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_cam).putExtra("message_id", R.string.permission_cam_access_on_contact_qr_scan_request).putExtra("message_params_id", R.string.localized_app_name).putExtra("perm_denial_message_id", R.string.permission_cam_access_on_contact_qr_scan).putExtra("perm_denial_message_params_id", R.string.localized_app_name).putExtra("permissions", new String[]{"android.permission.CAMERA"}).putExtra("force_ui", true), 1);
            } else {
                this.A0O.A0y();
            }
        }
    }

    public final void A1S(Bitmap bitmap) {
        ImageView imageView = this.A02;
        if (bitmap == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        this.A02.setImageBitmap(bitmap);
    }

    public final void A1T(boolean z) {
        A12(R.string.contact_qr_wait);
        this.A0V = true;
        this.A0W = z;
        this.A00 = SystemClock.elapsedRealtime();
        ContactQrActivity contactQrActivity = (ContactQrActivity) this;
        C79553lq c79553lq = new C79553lq(contactQrActivity.A01, ((AbstractActivityC49982Om) contactQrActivity).A0G, new C79533lo(contactQrActivity));
        C05Y c05y = c79553lq.A01;
        String A02 = c05y.A02();
        C04P[] c04pArr = new C04P[2];
        c04pArr[0] = new C04P("type", "contact", null, (byte) 0);
        c04pArr[1] = new C04P("action", z ? "revoke" : "get", null, (byte) 0);
        c05y.A07(215, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "w:qr", null, (byte) 0), new C04P("type", "set", null, (byte) 0)}, new C02590Ca("qr", c04pArr, null, null)), c79553lq, 32000L);
    }

    public boolean A1U(String str, boolean z, int i) {
        if (((AbstractC50702Sv) this.A0L).A0D || this.A0V) {
            return false;
        }
        this.A0S = str;
        return this.A0L.A02(str, z, i);
    }

    @Override // X.InterfaceC05810Qi
    public void ANV() {
        if (C002701i.A1P(this)) {
            return;
        }
        if (this.A0T) {
            finish();
            return;
        }
        A1S(null);
        if (this.A0O == null) {
            return;
        }
        ((AbstractC50702Sv) this.A0L).A0D = false;
        this.A0O.A07 = null;
    }

    public /* synthetic */ void lambda$onCreate$2139$BaseQrActivity(View view) {
        onBackPressed();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == 0) {
                if (this.A0X) {
                    finish();
                    return;
                }
                ViewPager viewPager = this.A03;
                boolean A0M = this.A0D.A0M();
                int i3 = A0M;
                if (0 == 0) {
                    i3 = !A0M;
                } else if (0 != 1) {
                    i3 = -1;
                }
                viewPager.A0B(i3, true);
                return;
            }
            this.A0O.A0y();
        } else if (i != 2) {
            if (i == 3) {
                this.A0O.A07 = null;
            } else if (i == 4 && i2 == -1) {
                A1Q();
            }
        } else if (i2 != -1) {
            this.A0V = false;
        } else if (intent == null) {
        } else {
            Uri data = intent.getData();
            this.A01 = data;
            if (data != null) {
                A12(R.string.contact_qr_wait);
                this.A0Q.ARy(new C0HS(this.A0P, this, this.A01, this.A02.getWidth(), this.A02.getHeight()) { // from class: X.3lp
                    public int A00;
                    public int A01;
                    public WeakReference A02;
                    public final Uri A03;
                    public final C41961un A04;

                    {
                        this.A04 = r2;
                        this.A03 = r4;
                        this.A01 = r5;
                        this.A00 = r6;
                        this.A02 = new WeakReference(this);
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        int max = Math.max(this.A01, this.A00);
                        try {
                            return this.A04.A0Z(this.A03, max, max);
                        } catch (C42671w8 | IOException e) {
                            Log.e("BaseQrActivity/loadImageRunnable Failed to load image", e);
                            return null;
                        }
                    }

                    @Override // X.C0HS
                    public void A09(Object obj) {
                        Bitmap bitmap = (Bitmap) obj;
                        AbstractActivityC49982Om abstractActivityC49982Om = (AbstractActivityC49982Om) this.A02.get();
                        if (abstractActivityC49982Om != null && !abstractActivityC49982Om.AFE()) {
                            abstractActivityC49982Om.A1S(bitmap);
                            if (bitmap == null) {
                                ((ActivityC02290Ap) abstractActivityC49982Om).A0A.A07(R.string.error_load_image, 0);
                                abstractActivityC49982Om.A0V = false;
                                abstractActivityC49982Om.ARS();
                                return;
                            }
                            abstractActivityC49982Om.A0Q.ARy(new C79443lf(abstractActivityC49982Om.A0P, abstractActivityC49982Om.A0Y, abstractActivityC49982Om.A01), new Void[0]);
                        }
                    }
                }, new Void[0]);
                return;
            }
            ((ActivityC02290Ap) this).A0A.A07(R.string.error_load_image, 0);
            this.A0V = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    @Override // X.C2On, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getString(R.string.contact_qr_title));
        setContentView(R.layout.contact_qr);
        Toolbar toolbar = (Toolbar) C0VJ.A0A(this, R.id.toolbar);
        toolbar.setNavigationIcon(new C0We(this.A0D, C02180Ae.A0Q(getResources().getDrawable(R.drawable.ic_back_teal), getResources().getColor(R.color.tealActionBarItemDrawableTint))));
        toolbar.setTitle(getString(R.string.contact_qr_title));
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 28));
        A0k(toolbar);
        this.A0K = new C70813Ts();
        this.A03 = (ViewPager) C0VJ.A0A(this, R.id.contact_qr_pager);
        this.A06 = (PagerSlidingTabStrip) C0VJ.A0A(this, R.id.contact_qr_tab_strip);
        ImageView imageView = (ImageView) C0VJ.A0A(this, R.id.contact_qr_preview);
        this.A02 = imageView;
        C0AT.A0V(imageView, 2);
        AnonymousClass012 anonymousClass012 = ((ActivityC02270An) this).A08;
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        C02L c02l = this.A05;
        InterfaceC002901k interfaceC002901k = this.A0Q;
        AnonymousClass011 anonymousClass011 = this.A0F;
        C01B c01b = ((ActivityC02290Ap) this).A0B;
        C50692Su c50692Su = new C50692Su(anonymousClass012, c018508q, c02l, interfaceC002901k, anonymousClass011, c01b, ((ActivityC02270An) this).A01, this.A0G, this.A07, ((ActivityC02290Ap) this).A0E, this.A04, this.A0J, this.A0A, this.A0B, this.A09, this.A0E, this.A0I, this.A0H, this.A08, this, c01b.A0E(C01C.A0K), ((ActivityC02290Ap) this).A0B.A0E(C01C.A1T), true, false, 3);
        this.A0L = c50692Su;
        c50692Su.A00 = true;
        C85963wZ c85963wZ = new C85963wZ(this, A0N());
        this.A0M = c85963wZ;
        this.A03.setAdapter(c85963wZ);
        this.A03.A0F(new C0Z7() { // from class: X.3wY
            {
                AbstractActivityC49982Om.this = this;
            }

            @Override // X.C0Z7, X.C0Z8
            public void AMh(int i, float f, int i2) {
                AbstractActivityC49982Om abstractActivityC49982Om = AbstractActivityC49982Om.this;
                boolean z = true;
                boolean A0M = abstractActivityC49982Om.A0D.A0M();
                int i3 = A0M;
                if (1 == 0) {
                    i3 = !A0M;
                } else if (1 != 1) {
                    i3 = -1;
                }
                if (i != i3 && f == 0.0f) {
                    z = false;
                }
                if (abstractActivityC49982Om.A0U != z) {
                    abstractActivityC49982Om.A0U = z;
                    if (z) {
                        abstractActivityC49982Om.A1R();
                        return;
                    }
                    QrScanCodeFragment qrScanCodeFragment = abstractActivityC49982Om.A0O;
                    qrScanCodeFragment.A02.A02.postDelayed(qrScanCodeFragment.A0D, 200L);
                    qrScanCodeFragment.A02.A02.removeCallbacks(qrScanCodeFragment.A0C);
                }
            }

            @Override // X.C0Z8
            public void AMi(int i) {
                AbstractActivityC49982Om abstractActivityC49982Om = AbstractActivityC49982Om.this;
                abstractActivityC49982Om.A0R();
                C85963wZ c85963wZ2 = abstractActivityC49982Om.A0M;
                if (c85963wZ2 != null) {
                    int i2 = 0;
                    do {
                        c85963wZ2.A00[i2].A00.setSelected(i2 == i);
                        i2++;
                    } while (i2 < 2);
                    if (abstractActivityC49982Om.A1P(i) == 1) {
                        if (!abstractActivityC49982Om.A0U) {
                            abstractActivityC49982Om.A0U = true;
                            abstractActivityC49982Om.A1R();
                        }
                        if (abstractActivityC49982Om.A0B.A05()) {
                            return;
                        }
                        ((ActivityC02290Ap) abstractActivityC49982Om).A0A.A07(R.string.no_internet_message, 1);
                        return;
                    }
                    return;
                }
                throw null;
            }
        });
        C0AT.A0W(this.A06, 0);
        this.A06.setViewPager(this.A03);
        String stringExtra = getIntent().getStringExtra("qrcode");
        this.A0S = stringExtra;
        if (stringExtra != null) {
            this.A0T = true;
            A1U(stringExtra, false, 5);
        }
        if (!this.A0T) {
            A1T(false);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("scan", false);
        this.A0X = booleanExtra;
        boolean A0M = this.A0D.A0M();
        int i = A0M;
        i = A0M;
        if (booleanExtra) {
            if (1 == 0) {
                i = !A0M;
            } else if (1 != 1) {
                i = -1;
            }
        } else if (0 == 0) {
            i = !A0M;
        } else if (0 != 1) {
            i = -1;
        }
        this.A03.A0B(i, false);
        C85963wZ c85963wZ2 = this.A0M;
        if (c85963wZ2 != null) {
            int i2 = 0;
            do {
                c85963wZ2.A00[i2].A00.setSelected(i2 == i);
                i2++;
            } while (i2 < 2);
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        int A1P = A1P(this.A03.getCurrentItem());
        if (A1P == 0) {
            menu.setGroupVisible(0, true);
            return true;
        }
        if (A1P == 1) {
            menu.setGroupVisible(0, false);
        }
        return true;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A0K.A01(((ActivityC02290Ap) this).A0E, getWindow());
        A1S(null);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        this.A0K.A00(getWindow());
        super.onStop();
    }
}
