package X;

import com.whatsapp.util.Log;

/* renamed from: X.2Hi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48902Hi implements InterfaceC010405f {
    public final C018508q A00;
    public final C48872He A01;
    public final C05Y A02;

    public C48902Hi(C018508q c018508q, C05Y c05y, C48872He c48872He) {
        this.A00 = c018508q;
        this.A02 = c05y;
        this.A01 = c48872He;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("ChatSupportTicketProtocolHelper/onDeliveryFailure");
        this.A00.A0G(new RunnableEBaseShape3S0100000_I0_3(this.A01, 19));
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        StringBuilder sb = new StringBuilder("ChatSupportTicketProtocolHelper/onError: error response:");
        sb.append(c02590Ca);
        Log.e(sb.toString());
        C02590Ca A0D = c02590Ca.A0D("error");
        if (A0D != null) {
            this.A00.A0G(new RunnableEBaseShape0S0101000_I0(this, A0D.A05("code", 0), 4));
        }
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C02590Ca A0D;
        String A0F;
        C02590Ca A0D2 = c02590Ca.A0D("response");
        if (A0D2 != null && (A0D = A0D2.A0D("ticket_id")) != null && (A0F = A0D.A0F()) != null) {
            C000200d.A14("ChatSupportTicketProtocolHelper/onSuccess called, ticketId=", A0F);
            this.A00.A0G(new RunnableEBaseShape0S1100000_I0(this, A0F, 14));
            return;
        }
        Log.e("ChatSupportTicketProtocolHelper/onSuccess called but ticketId is null, posting an error");
        this.A00.A0G(new RunnableEBaseShape3S0100000_I0_3(this, 18));
    }
}
