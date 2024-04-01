package com.whatsapp;

import X.AbstractActivityC04520Kt;
import X.AbstractActivityC04530Ku;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.C000200d;
import X.C011005l;
import X.C017708g;
import X.C018708s;
import X.C01C;
import X.C05W;
import X.C05Y;
import X.C06C;
import X.C0ES;
import X.C0SG;
import X.C1D6;
import X.C1DD;
import X.C1DV;
import X.C1LA;
import X.C24921Dj;
import X.C34451hX;
import X.C35481jD;
import X.C35491jE;
import X.C35501jF;
import X.C458123v;
import X.C79403lb;
import X.InterfaceC04550Kw;
import X.InterfaceC458223w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.pdf.PdfDocument;
import android.nfc.NfcAdapter;
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
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.ShareInviteLinkActivity;
import com.whatsapp.qrcode.GroupLinkQrActivity;
import com.whatsapp.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.EnumMap;

/* loaded from: classes.dex */
public class ShareInviteLinkActivity extends AbstractActivityC04520Kt implements InterfaceC04550Kw, InterfaceC458223w {
    public C1LA A00;
    public C1LA A01;
    public C35481jD A02;
    public C35491jE A03;
    public C35501jF A04;
    public C05W A05;
    public C018708s A06;
    public C0ES A07;
    public C011005l A08;
    public C05Y A09;
    public String A0A;
    public final BroadcastReceiver A0B = new BroadcastReceiver() { // from class: X.1L9
        {
            ShareInviteLinkActivity.this = this;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.nfc.action.ADAPTER_STATE_CHANGED".equals(intent.getAction())) {
                ShareInviteLinkActivity.this.invalidateOptionsMenu();
            }
        }
    };
    public final C34451hX A0C = new C34451hX(this);

    public /* synthetic */ void A1T(C458123v c458123v) {
        C011005l c011005l = this.A08;
        if (c011005l == null || !c011005l.equals(c458123v.A00)) {
            return;
        }
        A1U(c458123v.A01);
    }

    public final void A1U(String str) {
        this.A0A = str;
        String A0H = TextUtils.isEmpty(str) ? null : C000200d.A0H("https://chat.whatsapp.com/", str);
        if (!TextUtils.isEmpty(str)) {
            ((AbstractActivityC04530Ku) this).A01.setText(A0H);
            String A0D = ((ActivityC02310Ar) this).A01.A0D(R.string.share_invite_link_message, A0H);
            C06C A09 = this.A05.A09(this.A08);
            if (A09 == null) {
                Log.e("invitelink/share/no-contact");
            } else {
                C35491jE c35491jE = this.A03;
                c35491jE.A02 = A0D;
                c35491jE.A01 = ((ActivityC02310Ar) this).A01.A0D(R.string.share_invite_link_subject, this.A06.A08(A09, false));
                this.A03.A00 = ((ActivityC02310Ar) this).A01.A06(R.string.share_invite_link_via);
            }
            this.A04.A00 = A0D;
            this.A02.A00 = A0H;
            return;
        }
        A1V(false);
        ((AbstractActivityC04530Ku) this).A01.setText(" \n ");
    }

    public final void A1V(boolean z) {
        ((AbstractActivityC04530Ku) this).A01.setEnabled(z);
        ((C1LA) this.A02).A00.setEnabled(z);
        this.A01.A00.setEnabled(z);
        ((C1LA) this.A03).A00.setEnabled(z);
        ((C1LA) this.A04).A00.setEnabled(z);
    }

    public final void A1W(boolean z) {
        C000200d.A1C("invitelink/sendgetlink/recreate:", z);
        if (z) {
            A1V(false);
            A0m(true);
        }
        C79403lb c79403lb = new C79403lb(((ActivityC02290Ap) this).A0A, this.A09, this, z);
        C011005l c011005l = this.A08;
        if (c011005l == null) {
            throw null;
        }
        c79403lb.A00(c011005l);
    }

    @Override // X.InterfaceC458223w
    public void ALI(String str, int i, boolean z) {
        A1V(true);
        A0m(false);
        if (str != null) {
            StringBuilder sb = new StringBuilder("invitelink/gotcode/");
            sb.append(str);
            sb.append(" recreate:");
            sb.append(z);
            Log.i(sb.toString());
            C0ES c0es = this.A07;
            c0es.A0k.put(this.A08, str);
            A1U(str);
            if (z) {
                AUj(R.string.reset_link_complete);
                return;
            }
            return;
        }
        C000200d.A0q("invitelink/failed/", i);
        if (i == 401) {
            ((ActivityC02290Ap) this).A0A.A07(R.string.failed_create_invite_link_not_admin, 0);
        } else if (i != 404) {
            ((ActivityC02290Ap) this).A0A.A07(R.string.register_try_again_later, 0);
        } else {
            ((ActivityC02290Ap) this).A0A.A07(R.string.failed_create_invite_link_no_group, 0);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            return;
        }
        finish();
    }

    @Override // X.InterfaceC04550Kw
    public void ARt() {
        A1W(true);
    }

    public /* synthetic */ void lambda$onCreate$2872$ShareInviteLinkActivity(View view) {
        startActivity(GroupLinkQrActivity.A00(this, this.A08));
    }

    public /* synthetic */ void lambda$onCreate$2873$ShareInviteLinkActivity(View view) {
        C011005l c011005l = this.A08;
        if (c011005l != null) {
            AUg(RevokeLinkConfirmationDialogFragment.A00(c011005l, false), null);
            return;
        }
        throw null;
    }

    @Override // X.AbstractActivityC04520Kt, X.AbstractActivityC04530Ku, X.AbstractActivityC04540Kv, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(((ActivityC02310Ar) this).A01.A06(R.string.share_invite_link_title));
        ((TextView) findViewById(R.id.share_link_description)).setText(R.string.invite_link_description);
        this.A04 = A1S();
        this.A02 = A1Q();
        this.A03 = A1R();
        C1LA c1la = new C1LA();
        this.A00 = c1la;
        c1la.A00 = A1P();
        this.A00.A00(R.drawable.ic_scan_qr, ((ActivityC02310Ar) this).A01.A06(R.string.settings_qr), new View.OnClickListener() { // from class: X.1IT
            {
                ShareInviteLinkActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareInviteLinkActivity.this.lambda$onCreate$2872$ShareInviteLinkActivity(view);
            }
        });
        this.A00.A00.setVisibility(((ActivityC02290Ap) this).A0B.A0E(C01C.A15) ? 0 : 8);
        C1LA c1la2 = new C1LA();
        this.A01 = c1la2;
        c1la2.A00 = A1P();
        this.A01.A00(R.drawable.ic_revoke_invite, ((ActivityC02310Ar) this).A01.A06(R.string.revoke_invite_link), new View.OnClickListener() { // from class: X.1IU
            {
                ShareInviteLinkActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareInviteLinkActivity.this.lambda$onCreate$2873$ShareInviteLinkActivity(view);
            }
        });
        C011005l A04 = C011005l.A04(getIntent().getStringExtra("jid"));
        if (A04 != null) {
            this.A08 = A04;
            if (this.A05.A09(A04) == null) {
                StringBuilder A0P = C000200d.A0P("invitelink/sharelink/no-contact ");
                A0P.append(this.A08);
                Log.e(A0P.toString());
                finish();
                return;
            }
            A1U((String) this.A07.A0k.get(this.A08));
            A1W(false);
            if (Build.VERSION.SDK_INT >= 18) {
                registerReceiver(this.A0B, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
            }
            A01(this.A0C);
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (Build.VERSION.SDK_INT >= 19 && !((ActivityC02290Ap) this).A0B.A0E(C01C.A15)) {
            menu.add(0, R.id.menuitem_print, 0, ((ActivityC02310Ar) this).A01.A06(R.string.print_invite_link_qr_code));
        }
        if (NfcAdapter.getDefaultAdapter(this) != null) {
            menu.add(0, R.id.menuitem_write_tag, 0, ((ActivityC02310Ar) this).A01.A06(R.string.write_nfc_tag));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 18) {
            unregisterReceiver(this.A0B);
        }
        C0ES c0es = this.A07;
        c0es.A0W.A00(this.A0C);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_print) {
            StringBuilder A0P = C000200d.A0P("invitelink/printlink/");
            A0P.append(this.A0A);
            A0P.append(" jid:");
            A0P.append(this.A08);
            Log.i(A0P.toString());
            if (this.A08 != null && this.A0A != null) {
                try {
                    EnumMap enumMap = new EnumMap(C1D6.class);
                    StringBuilder sb = new StringBuilder();
                    sb.append("whatsapp://chat?code=");
                    sb.append(this.A0A);
                    C0SG A01 = C24921Dj.A01(sb.toString(), C1DV.M, enumMap);
                    if (A01 != null) {
                        C017708g c017708g = A01.A04;
                        C06C A09 = this.A05.A09(this.A08);
                        if (A09 == null) {
                            Log.e("invitelink/print/no-contact");
                            return true;
                        }
                        String A0D = ((ActivityC02310Ar) this).A01.A0D(R.string.share_invite_link_qr_code, this.A06.A08(A09, false));
                        PrintManager printManager = (PrintManager) getSystemService("print");
                        if (printManager == null) {
                            Log.e("invitelink/print/no-print-manager");
                            return true;
                        }
                        printManager.print(A0D, new PrintDocumentAdapter(this, ((ActivityC02290Ap) this).A0H, A0D, c017708g) { // from class: X.1Kz
                            public Context A00;
                            public PrintedPdfDocument A01;
                            public final C017708g A02;
                            public final C40081rY A03;
                            public final String A04 = "join_whatsapp_group.pdf";
                            public final String A05;

                            {
                                this.A00 = this;
                                this.A03 = r3;
                                this.A05 = A0D;
                                this.A02 = c017708g;
                            }

                            @Override // android.print.PrintDocumentAdapter
                            public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
                                this.A01 = new PrintedPdfDocument(this.A00, printAttributes2);
                                if (cancellationSignal.isCanceled()) {
                                    layoutResultCallback.onLayoutCancelled();
                                } else {
                                    layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.A04).setContentType(0).setPageCount(1).build(), true);
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r4v2, types: [int] */
                            /* JADX WARN: Type inference failed for: r4v4, types: [android.print.PrintDocumentAdapter$WriteResultCallback] */
                            @Override // android.print.PrintDocumentAdapter
                            public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
                                PdfDocument.Page startPage = this.A01.startPage(0);
                                Canvas canvas = startPage.getCanvas();
                                TextView textView = new TextView(this.A00);
                                textView.setTextColor(-16777216);
                                textView.setTextSize(0, canvas.getWidth() / 25);
                                textView.setGravity(1);
                                textView.setText(C002701i.A0d(this.A05, this.A00, textView.getPaint(), this.A03));
                                int width = canvas.getWidth() >> 3;
                                textView.measure(View.MeasureSpec.makeMeasureSpec(canvas.getWidth() - (width << 1), 1073741824), View.MeasureSpec.makeMeasureSpec(canvas.getHeight(), EditorInfoCompat.IME_FLAG_FORCE_ASCII));
                                textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
                                canvas.translate(width, width >> 1);
                                textView.draw(canvas);
                                int i = -width;
                                canvas.translate(i, i >> 1);
                                C017708g c017708g2 = this.A02;
                                int i2 = c017708g2.A01;
                                int i3 = c017708g2.A00;
                                int min = Math.min(canvas.getWidth(), canvas.getHeight() - textView.getMeasuredHeight());
                                int i4 = min >> 3;
                                int i5 = min - (i4 << 1);
                                float f = (i5 * 1.0f) / i2;
                                canvas.translate(i4, textView.getMeasuredHeight() + i4);
                                Paint paint = new Paint();
                                paint.setColor(-16777216);
                                for (int i6 = 0; i6 < i2; i6++) {
                                    for (int i7 = 0; i7 < i3; i7++) {
                                        if (c017708g2.A02[i7][i6] == 1) {
                                            canvas.drawRect(f * i6, f * i7, f * (i6 + 1), f * (i7 + 1), paint);
                                        }
                                    }
                                }
                                int i8 = (i5 << 2) / 15;
                                PrintDocumentAdapter.WriteResultCallback writeResultCallback2 = i5 - i8;
                                int i9 = writeResultCallback2 >> 1;
                                int i10 = i8 + i9;
                                canvas.drawBitmap(BitmapFactory.decodeResource(this.A00.getResources(), R.drawable.ic_qr_walogo), (Rect) null, new Rect(i9, i9, i10, i10), (Paint) null);
                                this.A01.finishPage(startPage);
                                try {
                                    try {
                                        writeResultCallback2 = writeResultCallback;
                                        this.A01.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                                        this.A01.close();
                                        this.A01 = null;
                                        writeResultCallback2.onWriteFinished(new PageRange[]{new PageRange(0, 0)});
                                    } catch (IOException e) {
                                        writeResultCallback2.onWriteFailed(e.toString());
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
                        return true;
                    }
                } catch (C1DD e) {
                    Log.i("invitelink/", e);
                }
            }
            return true;
        } else if (itemId == R.id.menuitem_write_tag) {
            StringBuilder A0P2 = C000200d.A0P("invitelink/writetag/");
            A0P2.append(this.A0A);
            A0P2.append(" jid:");
            A0P2.append(this.A08);
            Log.i(A0P2.toString());
            if (this.A08 != null && this.A0A != null) {
                Intent intent = new Intent(this, WriteNfcTagActivity.class);
                intent.putExtra("mime", "application/com.whatsapp.join");
                intent.putExtra("data", this.A0A);
                startActivity(intent);
            }
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0014, code lost:
        if (r1 == false) goto L8;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onPrepareOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            r0 = 2131363599(0x7f0a070f, float:1.8347011E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            if (r2 == 0) goto L1a
            android.nfc.NfcAdapter r0 = android.nfc.NfcAdapter.getDefaultAdapter(r3)
            if (r0 == 0) goto L16
            boolean r1 = r0.isEnabled()
            r0 = 1
            if (r1 != 0) goto L17
        L16:
            r0 = 0
        L17:
            r2.setEnabled(r0)
        L1a:
            boolean r0 = super.onPrepareOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ShareInviteLinkActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }
}
