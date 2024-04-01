package com.whatsapp.payments.ui;

import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.C002701i;
import X.C014006r;
import X.C01C;
import X.C02160Ac;
import X.C02L;
import X.C03750Gx;
import X.C04630Le;
import X.C04880Mg;
import X.C0GR;
import X.C0HS;
import X.C0L5;
import X.C0SG;
import X.C0U1;
import X.C0VJ;
import X.C0Zn;
import X.C1D6;
import X.C1DD;
import X.C1DV;
import X.C1L2;
import X.C24921Dj;
import X.C28661Tc;
import X.C2OX;
import X.C49E;
import X.C4LK;
import X.C70813Ts;
import X.C78103jM;
import X.C901249t;
import X.C90194Aa;
import X.C90204Ab;
import X.C90564Bm;
import X.C91544Fi;
import X.InterfaceC05620Pl;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.QrImageView;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiSecureQrCodeDisplayActivity;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.EnumMap;

/* loaded from: classes3.dex */
public class IndiaUpiSecureQrCodeDisplayActivity extends C4LK {
    public View A00;
    public TextView A01;
    public C02L A02;
    public C0Zn A03;
    public C0L5 A04;
    public C0GR A05;
    public C901249t A06;
    public IndiaUpiDisplaySecureQrCodeView A07;
    public C91544Fi A08;
    public C70813Ts A09 = new C70813Ts();
    public C2OX A0A;

    public final void A1a() {
        this.A07.A04(true);
        this.A00.setDrawingCacheEnabled(true);
        C2OX c2ox = this.A0A;
        c2ox.A01.ARy(new C0HS(getApplicationContext(), this.A00.getDrawingCache(), c2ox.A00, new C78103jM(this)) { // from class: X.3sX
            public final Bitmap A00;
            public final C012005w A01;
            public final C78103jM A02;
            public final WeakReference A03;

            {
                this.A03 = new WeakReference(r2);
                this.A00 = r3;
                this.A01 = r4;
                this.A02 = r5;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                Log.i("PAY: ShareQrCodeUtil start share QR code background job");
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("image/*");
                File A01 = AbstractC012105x.A01(this.A01.A0B(), "qrcode.jpg");
                Uri A04 = AnonymousClass024.A04((Context) this.A03.get(), A01);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(A01);
                    Bitmap.createBitmap(this.A00).compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.close();
                    intent.putExtra("android.intent.extra.STREAM", A04);
                    return Intent.createChooser(intent, null);
                } catch (IOException e) {
                    Log.e("PAY: ShareQrCodeUtil cannot process qr code for sharing", e);
                    return null;
                }
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                this.A02.A00.A1c((Intent) obj);
            }
        }, new Void[0]);
    }

    public /* synthetic */ void A1b() {
        IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = this.A07;
        String str = indiaUpiDisplaySecureQrCodeView.A0G.A02().A04;
        if (str != null) {
            indiaUpiDisplaySecureQrCodeView.A06.setText(C03750Gx.A01(indiaUpiDisplaySecureQrCodeView.A0C, C014006r.A00(str, indiaUpiDisplaySecureQrCodeView.A0E.A01().A9i()), indiaUpiDisplaySecureQrCodeView.A0E.A01()));
        }
    }

    public /* synthetic */ void A1c(Intent intent) {
        if (intent == null || intent.resolveActivity(getPackageManager()) == null) {
            ((ActivityC02290Ap) this).A0A.A07(R.string.share_qr_code_failed, 1);
            return;
        }
        startActivityForResult(intent, 1006);
        this.A00.setDrawingCacheEnabled(false);
    }

    public void A1d(C90204Ab c90204Ab) {
        int i = c90204Ab.A01;
        if (i == -1) {
            finish();
        } else if (i == 0) {
            if (!TextUtils.isEmpty(this.A08.A02().A04)) {
                this.A01.setText(getString(R.string.scan_this_code_to_pay_amount_to_user, this.A05.A01().A81(((ActivityC02310Ar) this).A01, C014006r.A00(this.A08.A02().A04, this.A05.A01().A9i())), this.A08.A02().A03));
            } else {
                this.A01.setText(getString(R.string.scan_this_code_to_pay_user, this.A08.A02().A03));
            }
            this.A01.setVisibility(0);
        } else if (i == 1) {
            this.A01.setVisibility(8);
        } else if (i != 3) {
            if (i == 3) {
                return;
            }
        } else if (c90204Ab.A00 != 0) {
            return;
        } else {
            A1a();
            return;
        }
        final IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = this.A07;
        if (indiaUpiDisplaySecureQrCodeView != null) {
            final int i2 = c90204Ab.A00;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        indiaUpiDisplaySecureQrCodeView.A01.setVisibility(0);
                        indiaUpiDisplaySecureQrCodeView.A0A.setVisibility(8);
                        indiaUpiDisplaySecureQrCodeView.A00.setVisibility(8);
                        indiaUpiDisplaySecureQrCodeView.A03.setVisibility(8);
                        indiaUpiDisplaySecureQrCodeView.A0F.A01();
                        indiaUpiDisplaySecureQrCodeView.A05(false);
                        return;
                    }
                    return;
                }
                indiaUpiDisplaySecureQrCodeView.A0A.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A03.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A01.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A07.setVisibility(4);
                indiaUpiDisplaySecureQrCodeView.A00.setVisibility(0);
                indiaUpiDisplaySecureQrCodeView.A0F.requestFocus();
                indiaUpiDisplaySecureQrCodeView.A0F.A02(true);
                indiaUpiDisplaySecureQrCodeView.A05(false);
                return;
            }
            indiaUpiDisplaySecureQrCodeView.A01.setVisibility(8);
            indiaUpiDisplaySecureQrCodeView.A0F.A01();
            indiaUpiDisplaySecureQrCodeView.A0A.setVisibility(0);
            indiaUpiDisplaySecureQrCodeView.A00.setVisibility(8);
            indiaUpiDisplaySecureQrCodeView.A03.setVisibility(0);
            try {
                C0SG A01 = C24921Dj.A01(indiaUpiDisplaySecureQrCodeView.A0G.A02().A05(), C1DV.L, new EnumMap(C1D6.class));
                indiaUpiDisplaySecureQrCodeView.A09 = A01;
                indiaUpiDisplaySecureQrCodeView.A0A.setQrCode(A01, new C1L2() { // from class: X.3k1
                    @Override // X.C1L2
                    public final void AIp(QrImageView qrImageView) {
                        indiaUpiDisplaySecureQrCodeView.A03(i2);
                    }
                });
            } catch (C1DD e) {
                indiaUpiDisplaySecureQrCodeView.A0H.A08("display-qrcode/", e);
            }
            indiaUpiDisplaySecureQrCodeView.A05(true);
            if (!TextUtils.isEmpty(indiaUpiDisplaySecureQrCodeView.A0G.A02().A04)) {
                indiaUpiDisplaySecureQrCodeView.A06.setVisibility(0);
                indiaUpiDisplaySecureQrCodeView.A02.setVisibility(0);
                indiaUpiDisplaySecureQrCodeView.A05.setVisibility(8);
                return;
            }
            indiaUpiDisplaySecureQrCodeView.A06.setVisibility(8);
            indiaUpiDisplaySecureQrCodeView.A02.setVisibility(8);
            indiaUpiDisplaySecureQrCodeView.A05.setVisibility(0);
            return;
        }
        throw null;
    }

    @Override // X.AbstractActivityC92444Kp, X.C4KG, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1006) {
            this.A07.A04(false);
        } else if (i != 202) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
        } else {
            A1a();
        }
    }

    @Override // X.C4LK, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        C49E A00;
        String trim;
        super.onCreate(bundle);
        setContentView(R.layout.india_payments_dispay_secure_qr_code);
        this.A01 = (TextView) findViewById(R.id.scan_to_pay_info);
        this.A07 = (IndiaUpiDisplaySecureQrCodeView) findViewById(R.id.display_qr_code_view);
        if (getIntent().getExtras() != null) {
            str = getIntent().getExtras().getString("extra_account_holder_name");
        } else {
            str = null;
        }
        String trim2 = !TextUtils.isEmpty(str) ? str.trim() : null;
        final C901249t c901249t = this.A06;
        if (c901249t != null) {
            C91544Fi c91544Fi = (C91544Fi) C002701i.A0J(this, new C28661Tc() { // from class: X.4Hp
                @Override // X.C28661Tc, X.C0CR
                public C0MU A6e(Class cls) {
                    if (cls.isAssignableFrom(C91544Fi.class)) {
                        IndiaUpiSecureQrCodeDisplayActivity indiaUpiSecureQrCodeDisplayActivity = this;
                        C901249t c901249t2 = c901249t;
                        return new C91544Fi(indiaUpiSecureQrCodeDisplayActivity, c901249t2.A07, c901249t2.A00, c901249t2.A08, c901249t2.A02, c901249t2.A09, c901249t2.A05, c901249t2.A0M, c901249t2.A0N, c901249t2.A0K, c901249t2.A0H);
                    }
                    throw new IllegalArgumentException("Invalid viewModel");
                }
            }).A00(C91544Fi.class);
            this.A08 = c91544Fi;
            InterfaceC05620Pl interfaceC05620Pl = new InterfaceC05620Pl() { // from class: X.3jN
                {
                    IndiaUpiSecureQrCodeDisplayActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    IndiaUpiSecureQrCodeDisplayActivity.this.A1d((C90204Ab) obj);
                }
            };
            InterfaceC05620Pl interfaceC05620Pl2 = new InterfaceC05620Pl() { // from class: X.3jO
                {
                    IndiaUpiSecureQrCodeDisplayActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    IndiaUpiSecureQrCodeDisplayActivity.this.A1b();
                }
            };
            c91544Fi.A02.A05(c91544Fi.A00, interfaceC05620Pl);
            c91544Fi.A01.A05(c91544Fi.A00, interfaceC05620Pl2);
            C90564Bm c90564Bm = c91544Fi.A0A;
            String[] A0L = c90564Bm.A0L();
            if (TextUtils.isEmpty(A0L[0])) {
                String A05 = c90564Bm.A05();
                if (TextUtils.isEmpty(A05)) {
                    c91544Fi.A02.A0B(new C90204Ab(-1, -1));
                } else {
                    if (TextUtils.isEmpty(trim2)) {
                        trim = c91544Fi.A09.A00.getString("push_name", "");
                        c91544Fi.A0C.A05(1, null);
                    } else {
                        trim = trim2.trim();
                    }
                    C49E A02 = c91544Fi.A02();
                    A02.A03 = trim;
                    A02.A0B = A05;
                    A02.A00 = "01";
                    c91544Fi.A01.A0B(A02);
                }
            } else {
                C04880Mg c04880Mg = c91544Fi.A01;
                String str2 = A0L[0];
                if (str2 == null) {
                    A00 = null;
                } else {
                    A00 = C49E.A00(Uri.parse(str2), true);
                    if (A00 == null) {
                        A00 = null;
                    } else {
                        A00.A02 = str2;
                    }
                }
                c04880Mg.A0B(A00);
            }
            final C0U1 A0c = A0c();
            if (A0c != null) {
                A0c.A08(R.string.my_qr_code);
                Drawable drawable = getResources().getDrawable(R.drawable.ic_back);
                drawable.setColorFilter(getResources().getColor(R.color.colorGrayQRCodeIcon), PorterDuff.Mode.SRC_ATOP);
                A0c.A0A(drawable);
                A0c.A0L(true);
                A0c.A06(0.0f);
                final View findViewById = findViewById(R.id.parent_view);
                findViewById.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.3QL
                    {
                        IndiaUpiSecureQrCodeDisplayActivity.this = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        IndiaUpiSecureQrCodeDisplayActivity indiaUpiSecureQrCodeDisplayActivity = IndiaUpiSecureQrCodeDisplayActivity.this;
                        View view = findViewById;
                        C0U1 c0u1 = A0c;
                        if (view.canScrollVertically(-1)) {
                            c0u1.A06(indiaUpiSecureQrCodeDisplayActivity.getResources().getDimension(R.dimen.actionbar_elevation));
                        } else {
                            c0u1.A06(0.0f);
                        }
                    }
                });
            }
            this.A07.setup(this.A08);
            this.A03 = this.A04.A04(this);
            C02L c02l = this.A02;
            c02l.A05();
            if (c02l.A01 != null) {
                C0Zn c0Zn = this.A03;
                C02L c02l2 = this.A02;
                c02l2.A05();
                c0Zn.A02(c02l2.A01, (ImageView) findViewById(R.id.contact_photo));
            }
            ((TextView) findViewById(R.id.user_wa_vpa)).setText(this.A08.A02().A0B);
            ((TextView) findViewById(R.id.user_account_name)).setText(this.A08.A02().A03);
            TextView textView = (TextView) findViewById(R.id.user_wa_phone);
            C02L c02l3 = this.A02;
            c02l3.A05();
            UserJid userJid = c02l3.A03;
            if (userJid != null) {
                textView.setText(C04630Le.A03(userJid.user));
                this.A00 = findViewById(R.id.qrcode_view);
                this.A01.setText(getString(R.string.scan_this_code_to_pay_user, this.A08.A02().A03));
                this.A08.A04(0, null);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable = getResources().getDrawable(R.drawable.ic_action_share);
        drawable.setColorFilter(getResources().getColor(R.color.colorGrayQRCodeIcon), PorterDuff.Mode.SRC_ATOP);
        menu.add(0, R.id.menuitem_share_qr, 0, R.string.share).setIcon(drawable).setShowAsAction(1);
        if (Build.VERSION.SDK_INT >= 19) {
            menu.add(0, R.id.menuitem_print, 0, R.string.print_qr_code);
        }
        if (((ActivityC02290Ap) this).A0B.A0E(C01C.A1w)) {
            menu.add(0, R.id.menuitem_sign_qr, 0, R.string.upi_signing_qr_code_revoke_menu_item);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.C4KG, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A03.A00();
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_share_qr) {
            if (C02160Ac.A01(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                int i = Build.VERSION.SDK_INT;
                int i2 = R.string.payment_permission_storage_need_write_access_v30;
                if (i < 30) {
                    i2 = R.string.payment_permission_storage_need_write_access;
                }
                startActivityForResult(RequestPermissionActivity.A01(this, R.string.payment_permission_storage_need_write_access_request, i2, true), 202);
                return true;
            }
            this.A08.A04(4, new C90194Aa(this.A07.getUserInputAmount()));
            return true;
        } else if (itemId == 16908332) {
            C0VJ.A0B(this);
            return true;
        } else {
            if (itemId == R.id.menuitem_print) {
                if (this.A07.A09 != null && !isFinishing()) {
                    View view = this.A00;
                    if (view == null) {
                        throw null;
                    }
                    view.setDrawingCacheEnabled(true);
                    this.A00.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    View view2 = this.A00;
                    view2.layout(0, 0, view2.getMeasuredWidth(), this.A00.getMeasuredHeight());
                    this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    this.A00.buildDrawingCache(true);
                    Bitmap createBitmap = Bitmap.createBitmap(this.A00.getDrawingCache());
                    C2OX c2ox = this.A0A;
                    String str = this.A08.A02().A03;
                    if (c2ox != null) {
                        PrintManager printManager = (PrintManager) getSystemService("print");
                        if (printManager == null) {
                            Log.e("PAY: payments-display-qr/print/no-print-manager");
                        } else {
                            printManager.print(str, new PrintDocumentAdapter(this, createBitmap) { // from class: X.1L0
                                public Context A00;
                                public PrintedPdfDocument A01;
                                public final Bitmap A02;
                                public final String A03 = "my_qrcode.pdf";

                                {
                                    this.A00 = this;
                                    this.A02 = createBitmap;
                                }

                                @Override // android.print.PrintDocumentAdapter
                                public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
                                    this.A01 = new PrintedPdfDocument(this.A00, printAttributes2);
                                    if (cancellationSignal.isCanceled()) {
                                        layoutResultCallback.onLayoutCancelled();
                                    } else {
                                        layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.A03).setContentType(0).setPageCount(1).build(), true);
                                    }
                                }

                                @Override // android.print.PrintDocumentAdapter
                                public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
                                    PdfDocument.Page startPage = this.A01.startPage(0);
                                    Canvas canvas = startPage.getCanvas();
                                    Bitmap bitmap = this.A02;
                                    int width = canvas.getWidth();
                                    int height = canvas.getHeight();
                                    if (height > 0 && width > 0) {
                                        float width2 = bitmap.getWidth() / bitmap.getHeight();
                                        float f = width;
                                        float f2 = height;
                                        if (f / f2 > width2) {
                                            width = (int) (f2 * width2);
                                        } else {
                                            height = (int) (f / width2);
                                        }
                                        bitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                                    }
                                    canvas.drawBitmap(bitmap, (canvas.getWidth() - bitmap.getWidth()) >> 1, (canvas.getHeight() - bitmap.getHeight()) >> 1, (Paint) null);
                                    this.A01.finishPage(startPage);
                                    try {
                                        try {
                                            this.A01.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                                            this.A01.close();
                                            this.A01 = null;
                                            writeResultCallback.onWriteFinished(new PageRange[]{new PageRange(0, 0)});
                                        } catch (IOException e) {
                                            writeResultCallback.onWriteFailed(e.toString());
                                            this.A01.close();
                                            this.A01 = null;
                                        }
                                    } catch (Throwable th) {
                                        this.A01.close();
                                        this.A01 = null;
                                        throw th;
                                    }
                                }
                            }, null);
                        }
                        this.A00.setDrawingCacheEnabled(false);
                    } else {
                        throw null;
                    }
                }
            } else if (itemId == R.id.menuitem_sign_qr) {
                this.A08.A04(3, null);
            }
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = this.A07;
        if (indiaUpiDisplaySecureQrCodeView.A00.getVisibility() == 0) {
            indiaUpiDisplaySecureQrCodeView.A0F.requestFocus();
            indiaUpiDisplaySecureQrCodeView.A0F.A02(true);
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A09.A01(((ActivityC02290Ap) this).A0E, getWindow());
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        this.A09.A00(getWindow());
    }
}
