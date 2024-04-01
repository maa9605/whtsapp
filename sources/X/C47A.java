package X;

import android.content.Context;
import android.hardware.Camera;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.whatsapp.util.Log;

/* renamed from: X.47A  reason: invalid class name */
/* loaded from: classes3.dex */
public class C47A extends SurfaceHolder$CallbackC49122Io implements SurfaceHolder.Callback {
    public int A00;
    public int A01;
    public Camera A02;
    public SurfaceHolder A03;

    @Override // X.SurfaceHolder$CallbackC49122Io, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public C47A(Context context) {
        super(context);
        SurfaceHolder holder = getHolder();
        this.A03 = holder;
        holder.addCallback(this);
    }

    @Override // X.SurfaceHolder$CallbackC49122Io, X.InterfaceC471629w
    public void ARq() {
        this.A09.post(new RunnableEBaseShape0S0200000_I0_0(this, this.A03, 33));
    }

    public int getDisplayOrientation() {
        int i;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(((SurfaceHolder$CallbackC49122Io) this).A00, cameraInfo);
        int rotation = defaultDisplay.getRotation();
        int i2 = 0;
        boolean z = cameraInfo.facing == 1;
        int i3 = cameraInfo.orientation;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        if (z) {
            i = (360 - ((i3 + i2) % 360)) % 360;
        } else {
            i = ((i3 - i2) + 360) % 360;
        }
        StringBuilder A0R = C000200d.A0R("bloks_camera/startpreview display:", i2, " camera:", i3, " preview:");
        A0R.append(i);
        A0R.append(" front:");
        A0R.append(z);
        Log.i(A0R.toString());
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8 A[Catch: all -> 0x0160, TryCatch #0 {, blocks: (B:8:0x0012, B:12:0x0018, B:13:0x001c, B:16:0x0028, B:18:0x0037, B:20:0x005b, B:21:0x005e, B:23:0x0062, B:25:0x0066, B:38:0x009e, B:42:0x00b0, B:44:0x00b4, B:45:0x00c2, B:47:0x00c8, B:49:0x00e3, B:53:0x00f3, B:54:0x00f7, B:56:0x00fd, B:60:0x0114, B:61:0x011a, B:39:0x00a1, B:41:0x00ae, B:62:0x0148, B:63:0x014d, B:65:0x015b, B:28:0x0074, B:30:0x007c, B:31:0x0080, B:33:0x0088, B:34:0x008c, B:36:0x0094, B:37:0x0098, B:15:0x0023), top: B:73:0x0012, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3 A[Catch: all -> 0x0160, TryCatch #0 {, blocks: (B:8:0x0012, B:12:0x0018, B:13:0x001c, B:16:0x0028, B:18:0x0037, B:20:0x005b, B:21:0x005e, B:23:0x0062, B:25:0x0066, B:38:0x009e, B:42:0x00b0, B:44:0x00b4, B:45:0x00c2, B:47:0x00c8, B:49:0x00e3, B:53:0x00f3, B:54:0x00f7, B:56:0x00fd, B:60:0x0114, B:61:0x011a, B:39:0x00a1, B:41:0x00ae, B:62:0x0148, B:63:0x014d, B:65:0x015b, B:28:0x0074, B:30:0x007c, B:31:0x0080, B:33:0x0088, B:34:0x008c, B:36:0x0094, B:37:0x0098, B:15:0x0023), top: B:73:0x0012, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114 A[Catch: all -> 0x0160, TryCatch #0 {, blocks: (B:8:0x0012, B:12:0x0018, B:13:0x001c, B:16:0x0028, B:18:0x0037, B:20:0x005b, B:21:0x005e, B:23:0x0062, B:25:0x0066, B:38:0x009e, B:42:0x00b0, B:44:0x00b4, B:45:0x00c2, B:47:0x00c8, B:49:0x00e3, B:53:0x00f3, B:54:0x00f7, B:56:0x00fd, B:60:0x0114, B:61:0x011a, B:39:0x00a1, B:41:0x00ae, B:62:0x0148, B:63:0x014d, B:65:0x015b, B:28:0x0074, B:30:0x007c, B:31:0x0080, B:33:0x0088, B:34:0x008c, B:36:0x0094, B:37:0x0098, B:15:0x0023), top: B:73:0x0012, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011a A[Catch: all -> 0x0160, TryCatch #0 {, blocks: (B:8:0x0012, B:12:0x0018, B:13:0x001c, B:16:0x0028, B:18:0x0037, B:20:0x005b, B:21:0x005e, B:23:0x0062, B:25:0x0066, B:38:0x009e, B:42:0x00b0, B:44:0x00b4, B:45:0x00c2, B:47:0x00c8, B:49:0x00e3, B:53:0x00f3, B:54:0x00f7, B:56:0x00fd, B:60:0x0114, B:61:0x011a, B:39:0x00a1, B:41:0x00ae, B:62:0x0148, B:63:0x014d, B:65:0x015b, B:28:0x0074, B:30:0x007c, B:31:0x0080, B:33:0x0088, B:34:0x008c, B:36:0x0094, B:37:0x0098, B:15:0x0023), top: B:73:0x0012, inners: #1, #2 }] */
    @Override // X.SurfaceHolder$CallbackC49122Io, android.view.SurfaceHolder.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void surfaceChanged(android.view.SurfaceHolder r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47A.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }
}
