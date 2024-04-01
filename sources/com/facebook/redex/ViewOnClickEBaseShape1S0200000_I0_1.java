package com.facebook.redex;

import X.C06C;
import X.C0D3;
import X.C53202c3;
import X.C54832jQ;
import X.C54842jR;
import X.InterfaceC74653dc;
import X.InterfaceC74693dg;
import android.graphics.PointF;
import android.view.View;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetDragIndicator;
import com.whatsapp.voipcalling.VoipCallNewParticipantBanner;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape1S0200000_I0_1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickEBaseShape1S0200000_I0_1(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UserJid of;
        switch (this.A02) {
            case 0:
                C54842jR c54842jR = (C54842jR) this.A00;
                c54842jR.A0E.A00((C06C) this.A01, c54842jR.A0D.A09(), 16, false, true);
                return;
            case 1:
                C54842jR c54842jR2 = (C54842jR) this.A00;
                c54842jR2.A0E.A06((C06C) this.A01, c54842jR2.A0D.A09(), 16, false);
                return;
            case 2:
                GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = (GroupCallParticipantPickerSheet) this.A00;
                PointF pointF = (PointF) this.A01;
                if (groupCallParticipantPickerSheet.A04.getVisibility() == 0 || pointF.y >= groupCallParticipantPickerSheet.A03.getY()) {
                    return;
                }
                groupCallParticipantPickerSheet.A08.A0O(5);
                return;
            case 3:
                C54832jQ c54832jQ = (C54832jQ) this.A00;
                c54832jQ.A0C.A04((C0D3) ((C53202c3) this.A01).A03.get(0), c54832jQ.A0B.A0A(), 3);
                return;
            case 4:
                ((VoipActivityV2) this.A00).A27((UserJid) this.A01);
                return;
            case 5:
                ((View.OnClickListener) this.A01).onClick(view);
                ((VoipActivityV2) this.A00).A1d();
                return;
            case 6:
                ((InterfaceC74653dc) this.A01).AIU(((VoipCallControlBottomSheetDragIndicator) this.A00).A01);
                return;
            case 7:
                VoipCallNewParticipantBanner voipCallNewParticipantBanner = (VoipCallNewParticipantBanner) this.A00;
                InterfaceC74693dg interfaceC74693dg = (InterfaceC74693dg) this.A01;
                C06C c06c = voipCallNewParticipantBanner.A07;
                if (c06c != null && (of = UserJid.of(c06c.A02())) != null) {
                    interfaceC74693dg.AHv(of);
                }
                voipCallNewParticipantBanner.A00();
                return;
            default:
                return;
        }
    }
}
