/*
 * Copyright 2014 JBoss by Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.console.ng.pr.model.events;

import org.jboss.errai.common.client.api.annotations.Portable;

/**
 *
 * @author salaboy
 */
@Portable
public class ProcessInstancesUpdateEvent {
    private Long processInstanceId;

    public ProcessInstancesUpdateEvent() {
    }

    public ProcessInstancesUpdateEvent(Long processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public Long getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(Long processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.processInstanceId != null ? this.processInstanceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProcessInstancesUpdateEvent other = (ProcessInstancesUpdateEvent) obj;
        if (this.processInstanceId != other.processInstanceId && (this.processInstanceId == null || !this.processInstanceId.equals(other.processInstanceId))) {
            return false;
        }
        return true;
    }
    
    
}
