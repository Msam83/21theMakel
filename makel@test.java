<?xml version="1.0" encoding="UTF-8"?>
<jcr:root xmlns:jcr="http://www.jcp.org/jcr/1.0"
          xmlns:sling="http://sling.apache.org/jcr/sling/1.0"
          jcr:primaryType="cq:Component"
          sling:resourceSuperType="core/wcm/components/accordion/v1/accordion">
    <items
        jcr:primaryType="nt:unstructured"
        sling:resourceType="granite/ui/components/coral/foundation/form/fieldset">

        <!-- Customized Accordion Title -->
        <title
            jcr:primaryType="nt:unstructured"
            sling:resourceType="granite/ui/components/coral/foundation/form/textfield"
            fieldLabel="Accordion Title"
            name="./title"
            value=""
            required="{Boolean}true"/>

        <!-- New Custom Field: Accordion Description -->
        <description
            jcr:primaryType="nt:unstructured"
            sling:resourceType="granite/ui/components/coral/foundation/form/textarea"
            fieldLabel="Accordion Description"
            name="./description"
            value=""
            rows="{Long}3"/>
        
        <!-- New Custom Field: Accordion Icon -->
        <icon
            jcr:primaryType="nt:unstructured"
            sling:resourceType="granite/ui/components/coral/foundation/form/pathfield"
            fieldLabel="Accordion Icon"
            name="./icon"
            rootPath="/content/dam/myapp/icons"
            predicate="asset"
            fileReferenceAttribute="fileReference"/>

        <!-- Rest of the Default Fields... -->
        <!-- ... -->

    </items>
</jcr:root>
