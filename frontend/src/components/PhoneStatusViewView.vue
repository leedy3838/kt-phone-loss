<template>

    <v-data-table
        :headers="headers"
        :items="phoneStatusView"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'PhoneStatusViewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            phoneStatusView : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/phoneStatusViews'))

            temp.data._embedded.phoneStatusViews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.phoneStatusView = temp.data._embedded.phoneStatusViews;
        },
        methods: {
        }
    }
</script>

