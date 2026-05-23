package generated.youTube.domain.generated;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class GeneratedChannel  {
private Long id;
private String name;
private String description;
private LocalDate creationDate;
private List<GeneratedVideo> videos = new ArrayList<GeneratedVideo>();
private GeneratedSubscription subscription;
private GeneratedChannelPermissionPolicy channelPermissionPolicy;
}
