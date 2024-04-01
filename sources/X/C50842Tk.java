package X;

import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import org.pjsip.PjCamera;

/* renamed from: X.2Tk */
/* loaded from: classes2.dex */
public class C50842Tk implements InterfaceC50852Tl {
    @Override // X.InterfaceC50852Tl
    public void AIB(VoipPhysicalCamera voipPhysicalCamera, int i) {
        if (this instanceof C50832Tj) {
            VoipCameraManager.clearStoredRawCameraInfo(((C50832Tj) this).A00, i, voipPhysicalCamera instanceof PjCamera ? 1 : 2);
        }
    }

    @Override // X.InterfaceC50852Tl
    public void AIc(VoipPhysicalCamera voipPhysicalCamera) {
        if (this instanceof C50832Tj) {
            VoipCameraManager.closeCurrentCamera(((C50832Tj) this).A00, voipPhysicalCamera);
        }
    }

    @Override // X.InterfaceC50852Tl
    public void AK6(VoipPhysicalCamera voipPhysicalCamera) {
        if (this instanceof C2U3) {
            ((C2U3) this).A00.A0E.sendEmptyMessage(11);
        }
    }

    @Override // X.InterfaceC50852Tl
    public void AOX(VoipPhysicalCamera voipPhysicalCamera) {
        if (this instanceof C2U3) {
            ((C2U3) this).A00.A0E.sendEmptyMessage(12);
        }
    }

    @Override // X.InterfaceC50852Tl
    public void AQ5(VoipPhysicalCamera voipPhysicalCamera) {
        if (this instanceof C2U3) {
            ((C2U3) this).A00.A0E.sendEmptyMessage(12);
        }
    }
}
