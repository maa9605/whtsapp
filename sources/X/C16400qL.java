package X;

import android.app.Notification;

/* renamed from: X.0qL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16400qL {
    public final int A00;
    public final int A01;
    public final Notification A02;

    public C16400qL(int notificationId, Notification notification, int foregroundServiceType) {
        this.A01 = notificationId;
        this.A02 = notification;
        this.A00 = foregroundServiceType;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || C16400qL.class != o.getClass()) {
            return false;
        }
        C16400qL c16400qL = (C16400qL) o;
        if (this.A01 == c16400qL.A01 && this.A00 == c16400qL.A00) {
            return this.A02.equals(c16400qL.A02);
        }
        return false;
    }

    public int hashCode() {
        return this.A02.hashCode() + (((this.A01 * 31) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ForegroundInfo{");
        sb.append("mNotificationId=");
        sb.append(this.A01);
        sb.append(", mForegroundServiceType=");
        sb.append(this.A00);
        sb.append(", mNotification=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
