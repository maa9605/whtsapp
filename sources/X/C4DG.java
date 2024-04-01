package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.4DG  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4DG extends AbstractView$OnClickListenerC49532Ky {
    public final /* synthetic */ C4KJ A00;

    public C4DG(C4KJ c4kj) {
        this.A00 = c4kj;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        C4KJ c4kj = this.A00;
        C019208x c019208x = new C019208x(c4kj);
        c019208x.A03(R.string.dyi_delete_report_diablog_title);
        c019208x.A01.A0E = c4kj.getBaseContext().getString(R.string.dyi_delete_report_dialog);
        c019208x.A04(R.string.cancel, null);
        c019208x.A06(R.string.delete, new DialogInterface.OnClickListener() { // from class: X.3Oh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C4DG.this.A01();
            }
        });
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.show();
        c4kj.A1Q(A00);
    }

    public void A01() {
        C4KJ c4kj = this.A00;
        byte[] A03 = C05V.A03(c4kj.A0B, c4kj.A04, false);
        if (A03 != null) {
            String A032 = C02A.A03(A03);
            final C92074Hk c92074Hk = c4kj.A0P;
            if (c92074Hk != null) {
                Log.i("DyiViewModel/delete-report");
                c92074Hk.A05(1);
                C48I c48i = c92074Hk.A05;
                final InterfaceC03640Gm interfaceC03640Gm = new InterfaceC03640Gm() { // from class: X.4F5
                    @Override // X.InterfaceC03640Gm
                    public void ANw(C28Q c28q) {
                        Log.i("DyiViewModel/delete-report/on-error");
                        if (c28q.A00 == 404) {
                            C92074Hk c92074Hk2 = C92074Hk.this;
                            C899248y c899248y = c92074Hk2.A06;
                            synchronized (c899248y) {
                                c899248y.A04();
                            }
                            c92074Hk2.A02.A0A(Integer.valueOf(c899248y.A02()));
                            return;
                        }
                        C92074Hk.this.A03.A0A(new C0FK(1, c28q));
                    }

                    @Override // X.InterfaceC03640Gm
                    public void AO1(C28Q c28q) {
                        Log.i("DyiViewModel/delete-report/on-error");
                        C92074Hk.this.A03.A0A(new C0FK(1, c28q));
                    }

                    @Override // X.InterfaceC03640Gm
                    public void AO2(C468228k c468228k) {
                        Log.i("DyiViewModel/delete-report/on-success");
                        C92074Hk c92074Hk2 = C92074Hk.this;
                        C899248y c899248y = c92074Hk2.A06;
                        synchronized (c899248y) {
                            c899248y.A04();
                        }
                        c92074Hk2.A02.A0A(Integer.valueOf(c899248y.A02()));
                    }
                };
                C463026g c463026g = c48i.A06;
                C02590Ca c02590Ca = new C02590Ca("account", new C04P[]{new C04P("action", "delete-payments-dyi-report", null, (byte) 0), new C04P("version", "1", null, (byte) 0), new C04P("nonce", A032, null, (byte) 0)}, null, null);
                final Context context = c48i.A00;
                final C018508q c018508q = c48i.A01;
                final C0E7 c0e7 = c48i.A02;
                final C28S c28s = c48i.A04;
                c463026g.A0E("set", c02590Ca, new C28V(context, c018508q, c0e7, c28s) { // from class: X.4Gi
                    @Override // X.C28V
                    public void A02(C28Q c28q) {
                        InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                        if (interfaceC03640Gm2 != null) {
                            interfaceC03640Gm2.ANw(c28q);
                        }
                    }

                    @Override // X.C28V
                    public void A03(C28Q c28q) {
                        InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                        if (interfaceC03640Gm2 != null) {
                            interfaceC03640Gm2.AO1(c28q);
                        }
                    }

                    @Override // X.C28V
                    public void A04(C02590Ca c02590Ca2) {
                        InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                        if (interfaceC03640Gm2 != null) {
                            interfaceC03640Gm2.AO2(new C77103hf());
                        }
                    }
                });
                return;
            }
            throw null;
        }
        throw null;
    }
}
