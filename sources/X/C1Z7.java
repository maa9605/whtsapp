package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Z7  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Z7 implements AnonymousClass137, InterfaceC21440zL, AnonymousClass117, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, InterfaceC21380zF, C10M {
    public final /* synthetic */ C06260Si A00;

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C1Z7(C06260Si c06260Si) {
        this.A00 = c06260Si;
    }

    @Override // X.InterfaceC21440zL
    public void AHQ(String str, long j, long j2) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC21440zL) it.next()).AHQ(str, j, j2);
        }
    }

    @Override // X.InterfaceC21440zL
    public void AHR(C21630ze c21630ze) {
        C06260Si c06260Si = this.A00;
        Iterator it = c06260Si.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC21440zL) it.next()).AHR(c21630ze);
        }
        c06260Si.A07 = null;
        c06260Si.A01 = 0;
    }

    @Override // X.InterfaceC21440zL
    public void AHS(C21630ze c21630ze) {
        C06260Si c06260Si = this.A00;
        c06260Si.A09 = c21630ze;
        Iterator it = c06260Si.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC21440zL) it.next()).AHS(c21630ze);
        }
    }

    @Override // X.InterfaceC21440zL
    public void AHT(C21030yg c21030yg) {
        C06260Si c06260Si = this.A00;
        c06260Si.A07 = c21030yg;
        Iterator it = c06260Si.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC21440zL) it.next()).AHT(c21030yg);
        }
    }

    @Override // X.InterfaceC21440zL
    public void AHV(int i) {
        C06260Si c06260Si = this.A00;
        if (c06260Si.A01 == i) {
            return;
        }
        c06260Si.A01 = i;
        Iterator it = c06260Si.A0M.iterator();
        while (it.hasNext()) {
            InterfaceC21400zH interfaceC21400zH = (InterfaceC21400zH) it.next();
            if (!c06260Si.A0L.contains(interfaceC21400zH)) {
                interfaceC21400zH.AHV(i);
            }
        }
        Iterator it2 = c06260Si.A0L.iterator();
        while (it2.hasNext()) {
            ((InterfaceC21440zL) it2.next()).AHV(i);
        }
    }

    @Override // X.InterfaceC21440zL
    public void AHW(int i, long j, long j2) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC21440zL) it.next()).AHW(i, j, j2);
        }
    }

    @Override // X.AnonymousClass117
    public void AJA(List list) {
        C06260Si c06260Si = this.A00;
        c06260Si.A0C = list;
        Iterator it = c06260Si.A0O.iterator();
        while (it.hasNext()) {
            ((AnonymousClass117) it.next()).AJA(list);
        }
    }

    @Override // X.AnonymousClass137
    public void AJd(int i, long j) {
        Iterator it = this.A00.A0P.iterator();
        while (it.hasNext()) {
            ((AnonymousClass137) it.next()).AJd(i, j);
        }
    }

    @Override // X.AnonymousClass137
    public void ANq(Surface surface) {
        C06260Si c06260Si = this.A00;
        if (c06260Si.A04 == surface) {
            Iterator it = c06260Si.A0Q.iterator();
            while (it.hasNext()) {
                ((AnonymousClass135) it.next()).ANp();
            }
        }
        Iterator it2 = c06260Si.A0P.iterator();
        while (it2.hasNext()) {
            ((AnonymousClass137) it2.next()).ANq(surface);
        }
    }

    @Override // X.AnonymousClass137
    public void AQJ(String str, long j, long j2) {
        Iterator it = this.A00.A0P.iterator();
        while (it.hasNext()) {
            ((AnonymousClass137) it.next()).AQJ(str, j, j2);
        }
    }

    @Override // X.AnonymousClass137
    public void AQK(C21630ze c21630ze) {
        C06260Si c06260Si = this.A00;
        Iterator it = c06260Si.A0P.iterator();
        while (it.hasNext()) {
            ((AnonymousClass137) it.next()).AQK(c21630ze);
        }
        c06260Si.A08 = null;
    }

    @Override // X.AnonymousClass137
    public void AQL(C21630ze c21630ze) {
        C06260Si c06260Si = this.A00;
        c06260Si.A0A = c21630ze;
        Iterator it = c06260Si.A0P.iterator();
        while (it.hasNext()) {
            ((AnonymousClass137) it.next()).AQL(c21630ze);
        }
    }

    @Override // X.AnonymousClass137
    public void AQM(C21030yg c21030yg) {
        C06260Si c06260Si = this.A00;
        c06260Si.A08 = c21030yg;
        Iterator it = c06260Si.A0P.iterator();
        while (it.hasNext()) {
            ((AnonymousClass137) it.next()).AQM(c21030yg);
        }
    }

    @Override // X.AnonymousClass137
    public void AQN(int i, int i2, int i3, float f) {
        C06260Si c06260Si = this.A00;
        Iterator it = c06260Si.A0Q.iterator();
        while (it.hasNext()) {
            AnonymousClass135 anonymousClass135 = (AnonymousClass135) it.next();
            if (!c06260Si.A0P.contains(anonymousClass135)) {
                anonymousClass135.AQN(i, i2, i3, f);
            }
        }
        Iterator it2 = c06260Si.A0P.iterator();
        while (it2.hasNext()) {
            ((AnonymousClass137) it2.next()).AQN(i, i2, i3, f);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C06260Si c06260Si = this.A00;
        c06260Si.A06(new Surface(surfaceTexture), true);
        c06260Si.A05(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C06260Si c06260Si = this.A00;
        c06260Si.A06(null, true);
        c06260Si.A05(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A05(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.A00.A05(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A06(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C06260Si c06260Si = this.A00;
        c06260Si.A06(null, false);
        c06260Si.A05(0, 0);
    }
}
