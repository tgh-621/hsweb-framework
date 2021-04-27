package org.hswebframework.web.system.authorization.api.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hswebframework.web.event.DefaultAsyncEvent;
import org.hswebframework.web.system.authorization.api.entity.UserEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDeletedEvent extends DefaultAsyncEvent {

    private UserEntity user;

}
