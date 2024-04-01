package X;

import com.whatsapp.AlarmService;
import com.whatsapp.ExternalMediaManager;
import com.whatsapp.appwidget.WidgetService;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.contact.sync.ContactsSyncAdapterService;
import com.whatsapp.data.ConversationDeleteService;
import com.whatsapp.instrumentation.api.InstrumentationService;
import com.whatsapp.instrumentation.service.InstrumentationFGService;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.media.transcode.MediaTranscodeService;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.notification.DirectReplyService;
import com.whatsapp.perf.ProfiloUploadService;
import com.whatsapp.push.GcmListenerService;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.schedulers.alarm.SchedulerExperimentAlarmService;
import com.whatsapp.schedulers.job.SchedulerExperimentJobService;
import com.whatsapp.service.BackgroundMediaControlService;
import com.whatsapp.service.GcmFGService;
import com.whatsapp.service.MDSyncService;
import com.whatsapp.service.UnsentMessagesNetworkAvailableJob;
import com.whatsapp.service.WebClientService;
import com.whatsapp.util.crash.ExceptionsUploadService;
import com.whatsapp.voipcalling.SelfManagedConnectionService;
import com.whatsapp.voipcalling.VoiceFGService;

/* renamed from: X.0RY */
/* loaded from: classes.dex */
public abstract class C0RY implements C0C6 {
    public abstract void A01(AlarmService alarmService);

    public abstract void A02(ExternalMediaManager externalMediaManager);

    public abstract void A03(WidgetService widgetService);

    public abstract void A04(GoogleBackupService googleBackupService);

    public abstract void A05(ContactsSyncAdapterService contactsSyncAdapterService);

    public abstract void A06(ConversationDeleteService conversationDeleteService);

    public abstract void A07(InstrumentationService instrumentationService);

    public abstract void A08(InstrumentationFGService instrumentationFGService);

    public abstract void A09(LocationSharingService locationSharingService);

    public abstract void A0A(MediaTranscodeService mediaTranscodeService);

    public abstract void A0B(MessageService messageService);

    public abstract void A0C(GoogleMigrateService googleMigrateService);

    public abstract void A0D(AndroidWear androidWear);

    public abstract void A0E(DirectReplyService directReplyService);

    public abstract void A0F(ProfiloUploadService profiloUploadService);

    public abstract void A0G(GcmListenerService gcmListenerService);

    public abstract void A0H(RegistrationIntentService registrationIntentService);

    public abstract void A0I(SchedulerExperimentAlarmService schedulerExperimentAlarmService);

    public abstract void A0J(SchedulerExperimentJobService schedulerExperimentJobService);

    public abstract void A0K(BackgroundMediaControlService backgroundMediaControlService);

    public abstract void A0L(GcmFGService gcmFGService);

    public abstract void A0M(MDSyncService mDSyncService);

    public abstract void A0N(UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob);

    public abstract void A0O(C0IL c0il);

    public abstract void A0P(WebClientService webClientService);

    public abstract void A0Q(ExceptionsUploadService exceptionsUploadService);

    public abstract void A0R(SelfManagedConnectionService selfManagedConnectionService);

    public abstract void A0S(VoiceFGService voiceFGService);
}
